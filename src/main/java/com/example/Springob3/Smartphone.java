package com.example.Springob3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String model;
    private Integer yearModel;

    public Smartphone(){
    }

    public Smartphone(Long id, String manufacturer, String model, Integer yearModel) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearModel = yearModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearModel() {
        return yearModel;
    }

    public void setYearModel(Integer yearModel) {
        this.yearModel = yearModel;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearModel=" + yearModel +
                '}';
    }
}
