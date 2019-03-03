package by.bntu.fitr.povt.beltring.javalabs.lab12.util;

public class Initialization {
    public static void createArray(double[][] matrix, int n){
        double value;
        int min = 0;
        
        int row = matrix.length;
        int column = matrix[0].length;
        
        for(int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                value = min + Math.random() * n;
                value = (double) Math.round(value * 100) / 100;
                
                matrix[i][j] = value;
            }
        }
    }
}
