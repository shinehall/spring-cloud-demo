package tech.chauncy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AppServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppServer1Application.class, args);
	}

}
