package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class RentalContract {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;
    
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    
    private String tenant;
    
    private double monthlyRent;

    // getters and setters
}

