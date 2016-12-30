package io.microservice.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservice.example.domain.User;
import io.microservice.example.repository.UserRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private UserRepository userRepository;

	@ApiOperation(value = "获取用户信息", notes = "")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		User findOne = this.userRepository.findOne(id);
		return findOne;
	}

	@ApiOperation(value = "添加用户", notes = "")
	@ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
	@PostMapping("/")
	public String addUser(@RequestBody User user) {
		this.userRepository.saveAndFlush(user);
		return "success";
	}

	@ApiOperation(value = "获取用户列表", notes = "")
	@GetMapping("/")
	public List<User> listUser() {
		return this.userRepository.findAll();
	}

	/**
	 * 本地服务实例的信息
	 * 
	 * @return
	 */
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
		ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
		return localServiceInstance;
	}
}
