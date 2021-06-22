package com.example.demosecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoSecurityApplication {

	public static void main(String[] args) {		
		System.out.println("SENHA ENCRIPITADA: "+ new BCryptPasswordEncoder().encode("pm123"));		
		SpringApplication.run(DemoSecurityApplication.class, args);
	}
}
