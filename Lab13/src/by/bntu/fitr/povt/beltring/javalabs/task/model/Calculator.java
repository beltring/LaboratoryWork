package by.bntu.fitr.povt.beltring.javalabs.task.model;

public class Calculator {
    public static int calculateSumOddRow(double[][] matrix){
        
        int result = -1;
        
        if(matrix == null){
            return result;
        }
        
        boolean odd;
        double sum = 0;
        double sumToCompare;
        int row = matrix.length;
        int column = matrix[0].length;
        
        for(int i = 0;i < row;i++){
            odd = true;
            for(int j = 0;j < column;j++){
                if(matrix[i][j] % 2 == 0){
                   odd = false;
                }
            }
            if(odd){
                sumToCompare = sum;
                sum = 0;
                for(int k = 0;k < column;k++){
                   sum += Math.abs(matrix[i][k]);
                }
                if(sum >= sumToCompare){
                    result = i;
                }
            }
        }
        
        return result;
    }
    
}
