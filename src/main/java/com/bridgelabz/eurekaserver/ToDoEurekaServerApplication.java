package com.bridgelabz.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/********************************************************************************
 * @author Ankita Kalgutkar
 *
 * Purpose:To enable Eureka Server
 ********************************************************************************/

@SpringBootApplication
@EnableEurekaServer
public class ToDoEurekaServerApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(ToDoEurekaServerApplication.class, args);
	}
}
