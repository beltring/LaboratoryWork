package by.bntu.fitr.povt.beltring.javalabs.lab11.view;

public class Printer {
    public static void print(String msg){
        System.out.println(msg);
    }
    
    public static void printArray(double[] array){
        System.out.print("\nArray: [");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.print("]");
    }
}
