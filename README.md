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

Java records are a clean way to define data without all the clutter. When you’re working on an API, they work well for DTOs that handle request or response data. In Spring Boot, you can use them to map request bodies, send responses, and run validation. Jackson still handles the JSON part in the background, and the same validation setup that works for regular classes works just fine here too. The real value comes from knowing how everything ties together when Spring turns JSON into a record or checks that the incoming values meet your rules.

I publish free articles like this daily, if you want to support my work and get access to exclusive content and weekly recaps, consider subscribing to my Substack.

How Java Records Work Behind the Scenes with Spring Boot
Their structure is locked in, which makes Java records a great fit for request and response objects. When you declare one, the compiler fills in a constructor, accessors, and a few utility methods. You write the record once, and Spring can use it for both reading from the client and writing back to them. What makes this work smoothly is how Spring and Jackson handle that constructor and field mapping behind the scenes.

Mapping JSON to a Record
When a request hits your controller with a body, Spring hands that JSON off to Jackson. Jackson reads the content, looks at the type you asked for, and checks if there’s a constructor that takes all the values it needs. For a record, that part’s already set. There’s only one constructor, and the parameters match the fields.