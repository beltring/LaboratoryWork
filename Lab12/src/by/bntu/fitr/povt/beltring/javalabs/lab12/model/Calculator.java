package by.bntu.fitr.povt.beltring.javalabs.lab12.model;

public class Calculator {
    public static int minMulColumn(double[][] matrix){
        int result = -1;
        
        if(matrix == null){
            return result;
        }
        
        int row = matrix.length;
        int column = matrix[0].length;
        
        double mul = 1;
        double mul1 = 1;
        
        for(int j = 0;j < column;j++){
            mul = 1;
            for (int i = 0; i < row; i++) {
                mul *= Math.abs(matrix[i][j]);
            }
            if(mul < mul1){
                result = j;
            }
            mul1 = mul;
        }
        
        return result;
    }
    
}
