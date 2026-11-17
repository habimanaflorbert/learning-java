to run the application with maven, use the following command:
mvnw spring-boot:run


the application will start on port 8080


we structure the project as follows:

#online.florbert.recap
    
    src
        main
            java
                online.florbert.recap
                    features directory
                    in each feature directory we have a package controller, service, model, repository
                    config directory for application configuration
                    utils directory for utility classes

controller in spring boot is a class that handles HTTP requests and returns HTTP responses


@RestController: This annotation marks the class as a REST controller, making it capable of handling HTTP requests.

@GetMapping("/hello"): This annotation maps HTTP GET requests with the URL path "/hello" to the method below.

public String sayHello(): This is a simple method that returns the string "Hello Florbert" when the endpoint is accessed.
