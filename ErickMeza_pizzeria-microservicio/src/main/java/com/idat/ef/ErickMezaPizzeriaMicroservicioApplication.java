package com.idat.ef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableEurekaClient
public class ErickMezaPizzeriaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErickMezaPizzeriaMicroservicioApplication.class, args);
	}
	
		private ApiInfo apiInfo() {
			return new ApiInfoBuilder()
					.description("La API de Pizzeria permite listar clientes, pizzas y pizzerias")
					.termsOfServiceUrl("https://idat.com.pe")
					.contact(new Contact("Erick Meza", "https://idat.com.pe", "A19201032@idat.edu.pe"))
					.license("License")
					.licenseUrl("https://idat.com.pe")
					.version("1.0.0")
					.build();
		}
		
		@Bean
		public Docket petApi() {
			return new Docket(DocumentationType.SWAGGER_2)
					.groupName("Pizzeria-Api")
					.apiInfo(apiInfo())
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.idat.ef"))
					.paths(PathSelectors.any())
					.build()
					.tags(new Tag("Pizzeria API", "Un API de una Pizzeria para solo listar"));
		}

}
