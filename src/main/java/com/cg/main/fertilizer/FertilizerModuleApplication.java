package com.cg.main.fertilizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author LENOVO
 * 
 */
@SpringBootApplication        //Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning
public class FertilizerModuleApplication {
/**
 * returns running ApplicationContext
 * @param args
 */
	public static void main(String[] args) {
		SpringApplication.run(FertilizerModuleApplication.class, args);
	}

}
