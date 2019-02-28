package by.bntu.fitr.povt.beltring.javalabs.lab11.util;

public class Initialization {
    public static void createArray(double[] array){
        int min = -10;
        int max = 20;
        
        for (int i = 0; i < array.length; i++) {
            double value = min + Math.random() * max;
            value = (double) Math.round(value * 100) / 100;
            
            array[i] = value;
        }
    }
}
