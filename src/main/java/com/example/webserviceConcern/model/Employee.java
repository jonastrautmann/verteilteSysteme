package com.example.webserviceConcern.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
public class Employee implements Serializable {
    //id for the employees so that each individual can be accessed
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id = 0;

    @ManyToOne
    private Concern concern;

    //first name of an employee
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "the first name has to be between 1 and 64 characters long")
    @NotNull(message = "the first name can not be empty")
    private String first_name = "";

    //last name of an employee
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "the last name has to be between 1 and 64 characters long")
    @NotNull(message = "the last name can not be empty")
    private String last_name = "";

    //age of an employee
    @Min(value = 1)
    @NotNull(message = "the age can not be empty")
    private int age = 0;

    //the place of residence of an employee
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "the place of residence has to be between 1 and 64 characters long")
    @NotNull(message = "the place of residence can not be empty")
    private String place_of_residence = "";

    //the seniority of an employee
    @NotNull(message = "the seniority can not be null")
    private double seniority = 0;

    //employee email
    @NotNull(message = "the email of an employee can not be null")
    private String email = "";

    public Employee() {
    }
}
