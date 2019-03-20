package by.bntu.fitr.povt.beltring.javalabs.task.model;

public class Calculator {
    public static int calculateSumOddRow(Matrix matrix){
        int result = -1;
        
        if(matrix == null || matrix.getMatrix().length == 0){
            return result;
        }
        
        boolean odd;
        double sum = 0;
        double sumToCompare;
        int row = matrix.getMatrix().length;
        int column = matrix.getMatrix()[0].length;
        
        for(int i = 0;i < row;i++){
            odd = true;
            for(int j = 0;j < column;j++){
                if(matrix.getMatrix()[i][j] % 2 == 0){
                   odd = false;
                }
            }
            if(odd){
                sumToCompare = sum;
                sum = 0;
                for(int k = 0;k < column;k++){
                   sum += Math.abs(matrix.getMatrix()[i][k]);
                }
                if(sum >= sumToCompare){
                    result = i;
                }
            }
        }
        
        return result;
    }
    
}
