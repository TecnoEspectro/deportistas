/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sportcenter;

/**
 *
 * @author SCIS2-13
 */
public class SportCenter {

    public static void main(String[] args) {
        SportistCenter sportCenter = new SportistCenter("El cumplin", "12213", "Bogota", "24 horas");
        
        Scenario scenario1 = new Scenario(1800, TypeSport.BASKETBALL, "24 Horas");
        Scenario scenario2 = new Scenario(400, TypeSport.SOCCER, "24 Horas");
        
        sportCenter.addScenario(scenario1);
        sportCenter.addScenario(scenario2);
        
        sportCenter.bookScneario(scenario1);
        sportCenter.bookScneario(scenario2);
                sportCenter.bookScneario(scenario1);
        
    }
}
