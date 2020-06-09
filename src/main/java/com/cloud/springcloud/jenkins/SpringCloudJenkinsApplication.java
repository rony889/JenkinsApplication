package com.cloud.springcloud.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//表示该类返回json格式
@EnableAutoConfiguration
//该类装配springboot内置tomcat中
public class SpringCloudJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudJenkinsApplication.class, args);
	}
	
    @RequestMapping("/index")
    public String test() {
        return "success";
    }

}