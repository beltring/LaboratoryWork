package by.bntu.fitr.povt.beltring.javalabs.lab10.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic.Manager;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.UserInput;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;

public class Lab10 {
    
    public static void main(String[] args) {
        boolean notExit = true;
        int choice;
        
        String nameCarShow = UserInput.inputStr("Enter the name of the car show:");
        CarShow carShow = new CarShow(nameCarShow);
        carShow.addRandom(4);
        
        Car lorry = new Lorry(2, 0.89, "HTG78T8F", 2007, "GAZ", 271234, 308750, 5); // refactor
        carShow.addObject(lorry);
        
        while(notExit){
            Printer.print("\n1.List of available cars.\n2.Add car.\n3.Remove car.\n"
                    + "4.Find the most cost car.\n5.Find the cheapest car."
                    + "\n6.Find a car by year of manufacture.\n0.Exit");
            choice = UserInput.inputInt("\nSelect menu item:");
            
            switch(choice){
                case 1: Printer.print(carShow); break;
                case 2: carShow.add(); break;
                case 3: carShow.remove(); break;
                case 4: Printer.print(Manager.MaximumCarCost(carShow) + "\n"); break;
                case 5: Printer.print(Manager.MinimumCarCost(carShow) + "\n"); break;
                case 6: int year = UserInput.inputInt("Enter car year:"); 
                        Manager.searchByYear(carShow, year); break;
                case 0: notExit = false; break;
            }
        }        
    }
}