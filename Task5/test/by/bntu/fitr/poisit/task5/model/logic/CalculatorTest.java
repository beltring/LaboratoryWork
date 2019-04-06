package by.bntu.fitr.poisit.task5.model.logic;

import by.bntu.fitr.poisit.task5.model.entity.Classic;
import by.bntu.fitr.poisit.task5.model.entity.Music;
import by.bntu.fitr.poisit.task5.model.entity.Popular;
import by.bntu.fitr.poisit.task5.model.entity.Rock;
import by.bntu.fitr.poisit.task5.model.entity.SoundRecording;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    Music m1 = new Rock("alternative rock",115,99,"Rammstein");
    Music m2 = new Popular(10_500_000, 1, 126,"KAZKA");
    Music m3 = new Classic(4, 90, "Paul Mauriat");
    Music m4 = new Popular(9_320_000, 3, 100,"Max Korzh");
    
    Music[] album = {m1, m2, m3, m4};
    
    SoundRecording recording = null;
    SoundRecording recording1 = new SoundRecording("EverestMedia", album);
    SoundRecording recording2 = new SoundRecording("EverestMedia");
    
    @Test
    public void testMinPlayTime() {
        Music[] expResult = null;
        Music[] result = Calculator.minPlayTime(recording);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testMinPlayTime1() {
        Music[] expResult = {m3};
        Music[] result = Calculator.minPlayTime(recording1);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testMinPlayTime2() {
        Music[] expResult = null;
        Music[] result = Calculator.minPlayTime(recording2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testTotalTime() {
        int expResult = 0;
        int result = Calculator.totalTime(recording);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTotalTime1() {
        int expResult = 415;
        int result = Calculator.totalTime(recording1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTotalTime2() {
        int expResult = 0;
        int result = Calculator.totalTime(recording2);
        assertEquals(expResult, result);
    }
}
