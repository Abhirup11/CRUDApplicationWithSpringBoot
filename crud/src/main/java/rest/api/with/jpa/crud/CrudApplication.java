package rest.api.with.jpa.crud;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {
 
	 private static final Logger logger
     = LoggerFactory.getLogger(CrudApplication.class);

	public static void main(String[] args) {
		
		logger.info("Welcome to CRUd Application REST API with Spring boot");
		SpringApplication.run(CrudApplication.class, args);
	}

}
