package by.bntu.fitr.povt.beltring.javalabs.lab12.view;

public class Printer {
    public static void print(String msg){
        System.out.print(msg);
    }
    
    public static void printMatrix(double[][] matrix){
        System.out.print("\nMatrix:\n");
        int row = matrix.length;
        int column = matrix[0].length;
        
        for(int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
