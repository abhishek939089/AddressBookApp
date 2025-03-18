package com.example.addressBook;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@OpenAPIDefinition(
		info = @Info(title = "Address Book API", version = "1.0", description = "API Documentation for Address Book")
)
@SpringBootApplication
@Slf4j
public class AddressBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookApplication.class, args);
		log.info("AddressBook App Started");
	}

}
