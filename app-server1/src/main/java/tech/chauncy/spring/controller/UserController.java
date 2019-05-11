package tech.chauncy.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tech.chauncy.spring.entity.UserInfo;

@RestController
@RequestMapping("/users")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserInfo getUserInfoById(@PathVariable("id") Long id) {
		logger.info("Test desc: " + client.description());
		return new UserInfo(id.longValue(), "ab", "111111", "cow", "123456789", "cow@email.com", "http://baidu.com", 10,
				(short) 1);
	}
	
}
