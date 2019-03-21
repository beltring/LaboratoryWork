package by.bntu.fitr.povt.beltring.javalabs.task.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.task.model.entity.Matrix;

public class Calculator {
    public static int calculateSumOddRow(Matrix matrix){
        int result = -1;
        boolean odd;
        int sum = 0;
        int sumToCompare;
        
        if(matrix == null || matrix.getCountRows() == 0){
            return result;
        }
        
        int rows = matrix.getCountRows();
        int columns = matrix.getCountColumns();
        
        for(int i = 0;i < rows;i++){
            odd = true;
            for(int j = 0;j < columns;j++){
                if(matrix.getElement(i, j) % 2 == 0){
                   odd = false;
                }
            }
            if(odd){
                sumToCompare = sum;
                sum = 0;
                for(int k = 0;k < columns;k++){
                   sum += Math.abs(matrix.getElement(i, k));
                }
                if(sum >= sumToCompare){
                    result = i;
                }
            }
        }
        
        return result;
    }
    
}
