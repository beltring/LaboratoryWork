package by.bntu.fitr.povt.beltring.javalabs.lab12.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab12.model.Calculator;
import by.bntu.fitr.povt.beltring.javalabs.lab12.util.Initialization;
import by.bntu.fitr.povt.beltring.javalabs.lab12.util.UserInput;
import by.bntu.fitr.povt.beltring.javalabs.lab12.view.Printer;

public class Lab12 {
    public static void main(String[] args) {
        int row = UserInput.input("Enter the number of row:");
        int column = UserInput.input("Enter the number of columns:");
        
        double[][] matrix = new double[row][column];
        int n = UserInput.input("Enter n:");
        Initialization.createArray(matrix,n);
        
        int columnNumber = Calculator.minMulColumn(matrix);
        Printer.print("Otvet " + columnNumber);
        
        Printer.printMatrix(matrix);
    }
}
