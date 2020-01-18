package com.spring5.practic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring5.practic.model.User;

@Configuration
@ComponentScan(basePackages = {"com.spring5.practic.services"})
public class RootConfig {

//	@Bean
//	public User user() {
//		var user = new User();
//		user.setName("Abdullah");
//		return user;
//	}
}
