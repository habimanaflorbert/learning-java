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