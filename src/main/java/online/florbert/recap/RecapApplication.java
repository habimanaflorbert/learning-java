package online.florbert.recap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RecapApplication {

	private static final Logger log = LoggerFactory.getLogger(RecapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecapApplication.class, args);
		log.info("Application started successfully");
	}

}
