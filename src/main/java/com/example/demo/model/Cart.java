package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Integer id;
    private int nrProducts;
}
