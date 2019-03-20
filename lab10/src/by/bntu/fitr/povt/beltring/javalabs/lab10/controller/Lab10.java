package by.bntu.fitr.povt.beltring.javalabs.lab10.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.MiniBus;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic.Manager;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Initialization;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.UserInput;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;

public class Lab10 {
    
    public static void main(String[] args) {
        boolean notExit = true;
        int choice;
        
        String nameCarShow = UserInput.inputStr("Enter the name of the car show:");
        CarShow carShow = new CarShow(nameCarShow);
        carShow.addRandom(4);
        
        Car lorry = new Lorry(2, 0.89, "HTG78T8F", 2007, 
                "GAZ", 27124, 308750, 5); // refactoring
        carShow.add(lorry);
        
        Car lorry1 = new Lorry(3.7, 0.89, "HHHHHH88", 2010, 
                "Mercedes-benz", 27124, 38750, 5); // refactoring
        carShow.add(lorry1); // refactoring
        
        Car miniBus = new MiniBus(10, "LPUTR67E", 2019, 
                "Mercedes-benz",151260, 100, 3); // refactoring
        carShow.add(miniBus);
        
        Printer.print(Manager.MaximumCargoCapacity(carShow));
        
//        System.out.println(lorry.getCost());
//        System.out.println(lorry.getCargoCapacity());
        
        while(notExit){
            Printer.print("\n1.List of available cars.\n2.Add car.\n"
                    + "3.Remove car.\n4.Find the most cost car.\n"
                    + "5.Find the cheapest car.\n"
                    + "6.Find a car by year of manufacture.\n0.Exit");
            choice = UserInput.inputInt("\nSelect menu item:");
            
            switch(choice){
                case 1: Printer.print(carShow); break;
                case 2: Car car = Initialization.createCarObject(); 
                carShow.add(car); break;
                case 3: String bodyNumber = UserInput.inputStr("Enter "
                        + "the number of the car body:");
                        carShow.remove(bodyNumber); break;
                case 4: Printer.print(Manager.MaximumCarCost(carShow) + "\n"); break;
                case 5: Printer.print(Manager.MinimumCarCost(carShow) + "\n"); break;
                case 6: int year = UserInput.inputInt("Enter car year:"); 
                        Manager.searchByYear(carShow, year); break;
                case 0: notExit = false; break;
            }
        }        
    }
}