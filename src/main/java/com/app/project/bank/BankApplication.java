package com.app.project.bank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Bank Application",
				description = "Backend Rest APIs for Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Isaque Ferreira",
						email = "isaquescheidegger@gmail.com",
						url = "https://github.com/IsaqueScheidegger/bank"
				),
				license = @License(
						name = "Bank",
						url = "https://github.com/IsaqueScheidegger/bank"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Documentation",
				url = "https://github.com/IsaqueScheidegger/bank"
		)
)
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
