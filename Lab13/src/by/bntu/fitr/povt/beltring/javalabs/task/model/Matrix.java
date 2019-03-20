package by.bntu.fitr.povt.beltring.javalabs.task.model;

public class Matrix {
    private double[][] matrix;

    public Matrix(){
        matrix = new double[0][0];
    }
    
    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }
    
}
