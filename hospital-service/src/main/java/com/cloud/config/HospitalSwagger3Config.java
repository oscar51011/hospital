package com.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * Swagger3的配置
 * 
 * @author oscar51011
 *
 */
@Configuration
public class HospitalSwagger3Config {

	@Bean
	public OpenAPI openAPIconfig() {
		return new OpenAPI().info(new Info().title("醫院服務").description("處理醫院模組功能"));
	}
	
}
