package by.bntu.fitr.povt.beltring.javalabs.lab11.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab11.model.Calculator;
import by.bntu.fitr.povt.beltring.javalabs.lab11.util.Initialization;
import by.bntu.fitr.povt.beltring.javalabs.lab11.util.UserInput;
import by.bntu.fitr.povt.beltring.javalabs.lab11.view.Printer;

public class Lab11 {
    public static void main(String[] args) {
        int count = UserInput.input("Enter the number of array elements: ");
    
        double[] array = new double[count];
        Initialization.createArray(array);
        Printer.printArray(array);
        
        double sum = Calculator.sumNegativeElements(array);
        double mul = Calculator.mulElements(array);
        
        Printer.print("\nSum negative elements = " + sum);
        Printer.print("\n Mul = " + mul);
    }
    
}
