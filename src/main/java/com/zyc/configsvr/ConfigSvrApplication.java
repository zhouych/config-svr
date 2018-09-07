package com.zyc.configsvr;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigSvrApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigSvrApplication.class).web(WebApplicationType.SERVLET).run(args);
	}
}
