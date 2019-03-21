package by.bntu.fitr.povt.beltring.javalabs.task.model.entity;

public class Matrix {
    public static final int DEFAULT_SIZE = 3;
    private int[][] array;

    public Matrix(){
        array = new int[DEFAULT_SIZE][DEFAULT_SIZE];
    }
    
    public Matrix(int[][] matrix) {
        this.array = matrix;
    }
    
    public Matrix(int rows, int columns){
        array = new int[rows][columns];
    }
    
    public Matrix(int size){
        this(size,size);
    }
    
    public Matrix(Matrix matrix){
        this(matrix.array.length, matrix.array[0].length);
        
        for (int i = 0; i < matrix.array.length; i++) {
            for (int j = 0; j < matrix.array[i].length ; j++) {
                array[i][j] = matrix.array[i][j];
            }
        }
    }
    
    
    public int getCountRows(){
        return array.length;
    }
    
    public int getCountColumns(){
        return array[0].length;
    }
    
    public int getElement(int i, int j){
        return array[i][j];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                builder.append(array[i][j]).append(" ");
            }
            builder.append("\n");
        }
        
        return builder.toString();
    }
    
    
}
