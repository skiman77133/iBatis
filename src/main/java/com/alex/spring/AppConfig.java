package com.alex.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:config/spring/spring-config-ibatis2.xml" })
public class AppConfig {
	
}
