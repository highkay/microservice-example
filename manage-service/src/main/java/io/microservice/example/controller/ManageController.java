package io.microservice.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservice.example.domain.User;
import io.microservice.example.service.UserServiceClient;

/**
 */
@RestController
@RequestMapping("/manage")
public class ManageController {
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private UserServiceClient userServiceClient;

	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		User findOne = this.userServiceClient.getUser(id);
		return findOne;
	}

	@PostMapping("/")
	public String addUser(@RequestBody User user) {
		this.userServiceClient.addUser(user);
		return "success";
	}

	@GetMapping("/")
	public List<User> listUser() {
		return this.userServiceClient.listUser();
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
