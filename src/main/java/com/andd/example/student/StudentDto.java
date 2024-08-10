package com.andd.example.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty(message = "Firstname should not be empty")
        String firstname,
        @NotEmpty(message = "Lastname should not be empty")
        String lastname,
        @NotEmpty(message = "Email should not be empty")
        String email,
        Integer schoolId
) {

}
