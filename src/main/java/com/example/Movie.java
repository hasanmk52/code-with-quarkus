package com.example;

import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Data
@Schema(name = "Movie", description = "Movie Representation")
public class Movie {

    private Long id;

    @Schema(required = true)
    private String title;
}
