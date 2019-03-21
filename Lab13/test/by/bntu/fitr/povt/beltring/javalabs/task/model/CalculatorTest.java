package by.bntu.fitr.povt.beltring.javalabs.task.model;

import by.bntu.fitr.povt.beltring.javalabs.task.model.entity.Matrix;
import by.bntu.fitr.povt.beltring.javalabs.task.model.logic.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of calculateSumOddRow method, of class Calculator.
     */
    @Test
    public void testCalculateSumOddRow() {
        Matrix matrix = new Matrix(new int[][] {
            {7,3,9,7},
            {2,4,3,5},
            {-7,3,9,11},
            {-3,5,7,1}
        });
        int expResult = 2;
        int result = Calculator.calculateSumOddRow(matrix);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testCalculateSumOddRow1() {
        int expResult = -1;
        int result = Calculator.calculateSumOddRow(null);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateSumOddRow2(){
        Matrix matrix = new Matrix(new int[][] {
            {1,2,5},
            {2,4,3},
            {-2,5,7}
        });
        int expResult = -1;
        int result = Calculator.calculateSumOddRow(matrix);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateSumOddRow3(){
        Matrix matrix = new Matrix(new int[][] {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        });
        int expResult = -1;
        int result = Calculator.calculateSumOddRow(matrix);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateSumOddRow4(){
        Matrix matrix = new Matrix();
        int expResult = -1;
        int result = Calculator.calculateSumOddRow(matrix);
        assertEquals(expResult, result);
    }
}
