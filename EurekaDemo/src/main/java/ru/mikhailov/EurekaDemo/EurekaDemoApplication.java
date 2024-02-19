package ru.mikhailov.EurekaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/*
Это сервер Eureka, созданный в учебных целях для управления модулем AppNotes
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemoApplication.class, args);
	}

}
