/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportcenter;

/**
 *
 * @author SCIS2-13
 */
public class Person {
    private String name;
    private String ID;
    private int age;
    private String gender;
    
    private Role role;

    public Person(String name, String ID, int age, String gender, Role role) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }
    
    
}
