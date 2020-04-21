package com.example.webserviceConcern.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Concern implements Serializable {
    //id for the concerns so that every concern can be accessed
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id = 0;

    //concern name
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "the concern name has to be between 1 and 64 characters long")
    @NotNull(message = "the concern name can not be empty")
    private String concern_name = "";

    //concern location
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "the location has to be between 1 and 64 characters long")
    @NotNull(message = "the location can not be empty")
    private String location = "";

    //year of founding of a concern
    @NotNull(message = "the year of founding can not be null")
    private int year_of_founding = 0;

    @OneToMany(mappedBy = "concern")
    private List<Employee> employees = new ArrayList<>();

    public Concern() {
    }
}
