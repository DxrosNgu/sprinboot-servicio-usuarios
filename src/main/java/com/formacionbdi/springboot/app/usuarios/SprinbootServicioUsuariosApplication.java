package com.formacionbdi.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.formacionbdi.springboot.app.commons.usuarios.models.entity"})
public class SprinbootServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinbootServicioUsuariosApplication.class, args);
	}

}
