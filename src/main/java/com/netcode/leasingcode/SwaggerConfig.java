package com.netcode.leasingcode;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	public static final Contact DEFAULT_CONTACT = new Contact("Netcode", "https://netcode.cl", "api@netcode.cl");
	
	public static final ApiInfo DEF_API_INFO = new ApiInfo("LeasingCode - API Documentación", "LeasingCode - API Documentación", "PREMIUN",
			null, DEFAULT_CONTACT,"Apache 2.0", "https://www.apache.org/licences/LICENCE-2.0",
			new ArrayList<VendorExtension>());
	
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.netcode.leasingcode.controller"))
				.paths(PathSelectors.any())
				.build()
				;
	}
	
	
	
	
}
