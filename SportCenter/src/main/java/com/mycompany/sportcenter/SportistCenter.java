/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportcenter;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SCIS2-13
 */
public class SportistCenter {
    private String name;
    private String ID;
    private String location;
    private String schedule;
    
    List<Scenario> scenaries = new ArrayList<>();

    public SportistCenter(String name, String ID, String location, String schedule) {
        this.name = name;
        this.ID = ID;
        this.location = location;
        this.schedule = schedule;
    }
    
    
    public void addScenario(Scenario scenario){
        this.scenaries.add(scenario);
}
    
    public void bookScneario(Scenario scenario){
       int index = this.scenaries.indexOf(scenario);
       Scenario sc = this.scenaries.get(index);
       
       if(sc.isAvailable()){
           System.out.println("ohh yeah");
           sc.setAvailable(false);
       }
    }
}
