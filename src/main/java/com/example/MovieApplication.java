package com.example;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

//This is to document the application in this case the movie application
//To view the open api document run the application and got to http://localhost:8080/q/openapi
@OpenAPIDefinition(
        info = @Info(
                title = "Movie APIs",
                description = "Movie Application", version = "1.0.0-SNAPSHOT",
                license = @License(name = "MIT", url = "http://localhost:8080")
        ),
        tags = {
                @Tag(name = "Movies", description = "Movies")
        }
)
public class MovieApplication extends Application {
}
