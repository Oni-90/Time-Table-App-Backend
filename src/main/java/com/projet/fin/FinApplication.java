package com.projet.fin;

import com.projet.fin.Config.CorsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CorsConfig.class)
public class FinApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinApplication.class, args);
	}

}
