package com.cg.main.fertilizer.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration          //Indicates that a class declares one or more @Bean methods.
@EnableSwagger2         //Indicates that Swagger support should be enabled
public class AppConfiguration  extends WebMvcConfigurationSupport {
	
/**
 * 	
 * @return
 */
	
@Bean                   //Indicates that a method produces a bean to be managed by the Spring container. 
public Docket version1() {
return new Docket(DocumentationType.SWAGGER_2).select()
.apis(RequestHandlerSelectors.basePackage("com.cg.main.fertilizer.controller")).paths(regex(".*" + ".*"))
.build().enable(true).groupName("Fertilizer")
.apiInfo(new ApiInfoBuilder().description("**FERTILIZER DETAILS**").title("NURSERY MANAGEMENT SYSTEM").build());
}
/*
 * overriding this method to add resource handlers for serving static resources.
 */
 @Override
protected void addResourceHandlers(ResourceHandlerRegistry registry) {
registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
}
 }

