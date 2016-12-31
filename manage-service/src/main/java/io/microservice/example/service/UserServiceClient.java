package io.microservice.example.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.microservice.example.domain.User;

@FeignClient(name = "login")
public interface UserServiceClient {

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User getUser(@RequestParam("id") Long id);

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public String addUser(@RequestBody User user);

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public List<User> listUser();

}
