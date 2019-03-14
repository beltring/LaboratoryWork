package by.bntu.fitr.povt.beltring.javalabs.task.model;

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
        double[][] matrix = {
            {7,3,9},
            {2,4,3},
            {-7,3,9},
            {-3,5,7}
        };
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
        double[][] matrix = {
            {1,2,5},
            {2,4,3},
            {-2,5,7}
        };
        int expResult = -1;
        int result = Calculator.calculateSumOddRow(matrix);
        assertEquals(expResult, result);
    }
    
}
