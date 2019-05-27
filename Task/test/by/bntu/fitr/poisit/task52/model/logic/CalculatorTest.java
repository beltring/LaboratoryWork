package by.bntu.fitr.poisit.task52.model.logic;

import by.bntu.fitr.poisit.task52.model.entity.Cucumber;
import by.bntu.fitr.poisit.task52.model.entity.Onion;
import by.bntu.fitr.poisit.task52.model.entity.Potato;
import by.bntu.fitr.poisit.task52.model.entity.Salad;
import by.bntu.fitr.poisit.task52.model.entity.Tomato;
import by.bntu.fitr.poisit.task52.model.entity.Vegetable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    Vegetable cucumber = new Cucumber("Smooth", 110, 154.2);
    Vegetable onion = new Onion(60, 30, 56.8);
    Vegetable potato = new Potato("Red", 87.6, 100.8);
    Vegetable tomato = new Tomato("Yellow", 12.8, 95.3, 67.7);
    
    Vegetable[] product = {cucumber, onion, potato, tomato};
    
    Salad salad = null;
    Salad salad1 = new Salad("Caesar");
    Salad salad2 = new Salad("Caesar", product);

    @Test
    public void testCalculateWeight() {
        double expResult = -1.0;
        double result = Calculator.calculateWeight(salad);
        assertEquals(expResult, result,0.1);
    }

    @Test
    public void testCalculateWeight1() {
        double expResult = -1.0;
        double result = Calculator.calculateWeight(salad1);
        assertEquals(expResult, result,0.1);
    }
    
    @Test
    public void testCalculateWeight2() {
        double expResult = 322.9;
        double result = Calculator.calculateWeight(salad2);
        assertEquals(expResult, result,0.1);
    }
    
    @Test
    public void testCalculateCalories(){
        double expResult = -1.0;
        double result = Calculator.calculateCalories(salad);
        assertEquals(expResult, result,0.1);
    }
    
    @Test
    public void testCalculateCalories1(){
        double expResult = -1.0;
        double result = Calculator.calculateCalories(salad1);
        assertEquals(expResult, result,0.1);
    }
    
    @Test
    public void testCalculateCalories2(){
        double expResult = 379.5;
        double result = Calculator.calculateCalories(salad2);
        assertEquals(expResult, result,379.5);
    }
}
