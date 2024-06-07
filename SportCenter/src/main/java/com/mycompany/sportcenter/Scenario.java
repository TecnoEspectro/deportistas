/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportcenter;

/**
 *
 * @author SCIS2-13
 */
public class Scenario {
    private int capacity;
    private TypeSport typesport;
    
    private String schedule;
    private boolean available;

    public Scenario(int capacity, TypeSport typesport, String schedule) {
        this.capacity = capacity;
        this.typesport = typesport;
        this.schedule = schedule;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
}
