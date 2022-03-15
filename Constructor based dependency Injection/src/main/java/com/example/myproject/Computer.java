package com.example.myproject;

import javax.annotation.PreDestroy;

public class Computer {

private String brand;

    public Computer() {
        System.out.println("no arg computer");
    }

    public Computer(String brand) {
        this.brand = brand;
        System.out.println("all arg computer called");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }


    @PreDestroy
    public void Destroyed()  {
        System.out.println("computer  object destroyed  " );
    }
}
