package by.bntu.fitr.povt.beltring.javalabs.lab10.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic.Manager;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;

public class Lab10 {
    
    public static void main(String[] args) {
        CarShow carShow = new CarShow("AUDI");
        
        carShow.addRandom(4);
        
        int maxCost = Manager.MaximumCarCost(carShow);
        
        Printer.print(carShow);
        Printer.print("\nAvg cost car = " + maxCost + "$");

    }
}