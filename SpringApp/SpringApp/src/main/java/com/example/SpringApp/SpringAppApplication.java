package com.example.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.example.Services", "com.example.SpringApp.controler","com.example.SpringApp.interfaces","com.example.SpringApp.interfaceService","com.example.SpringApp.modelo"})
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
