package by.bntu.fitr.povt.beltring.javalabs.lab11.model;

public class Calculator {
    public static double sumNegativeElements(double[] array){
        double sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                sum += array[i];
            }
        }
        
        sum = (double) Math.round(sum * 100) / 100;
        
        return sum;
    }
    
    private static int minElement(double[] array){
        double min = array[0];
        int imin = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                imin = i;
            }
        }
        
        return imin;
    }
    
    private static int maxElement(double[] array){
        double max = array[0];
        int imax = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                imax = i;
            }
        }
        
        return imax;
    }
    
    public static double mulElements(double[] array){
        double mul = 1;
        
        int imin = Calculator.minElement(array);
        int imax = Calculator.maxElement(array);
        
        if(imin < imax){
            for (int i = imin; i <= imax; i++) {
                mul *= array[i];
            }
        }else{
             for (int i = imax; i <= imin; i++){
                 mul *= array[i];
             }
        }
        
        mul = (double) Math.round(mul * 100) / 100;
        
        return mul;
    }
}
