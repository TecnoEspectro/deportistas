/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportcenter;

/**
 *
 * @author SCIS2-13
 */
public class SportsMan extends Person{
    private TypeSport typesport;
    private Category category;

    public SportsMan(TypeSport typesport, Category category, String name, String ID, int age, String gender, Role role) {
        super(name, ID, age, gender, role);
        this.typesport = typesport;
        this.category = category;
    }
    
    
    @Override
    public void doDopingTest(){
        System.out.println("Realizar prueba de doping");
    }
    
    @Override
    public void doDiet(){
        if(this.typesport == TypeSport.BASKETBALL){
            System.out.println("Dieta Basketbolera");
        }
        else if(this.typesport == TypeSport.VOLLEYBALL){
            System.out.println("Dieta Volleybolera");
        }
        else if(this.typesport == TypeSport.SOCCER){
            System.out.println("Dieta futbolera");
        }
    }
    
}
