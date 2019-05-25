package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsultantTest {
    private static final Logger LOG = 
            LogManager.getLogger(ConsultantTest.class);
    
    Car audiCar = new Car("HJTSDOP8", 2017, "AUDI", 21000, 15000, 1);
    Car bmwCar = new Car("ABCD87YH", 2016, "BMW", 21000, 33870, 1);
    Car bmwCar2 = new Car("URE56C7B", 2019, "BMW", 29250, 1925, 3);
    Car audiCar2 = new Car("IJN45SRI", 2018, "AUDI", 29250, 9340, 3);
    Car lorryBus1 = new Lorry(1.7, 2.1, "UQIY98LK", 2016, "Volkswagen",
            27000, 70000, 1);
    Car lorryBus2 = new Lorry(2.8, 1.8, "OKD97DT5", 2017, "Volkswagen",
            29000, 50530, 2);

    List<Car> cars = Arrays.asList(audiCar, bmwCar2, lorryBus1, lorryBus2);
    List<Car> cars2 = Arrays.asList(audiCar2, bmwCar, bmwCar2, audiCar,
            lorryBus1, lorryBus2);

    CarShow carShowNull = null; // ref
    CarShow carShow = new CarShow("AUDI", cars);
    CarShow carShow2 = new CarShow("BMW", cars2);

    private static Consultant сonsultant = new Consultant();
   
    @BeforeClass
    public static void setUp() {
        сonsultant = new Consultant();
    }

    @Test(expected = DataException.class)
    public void testMaximumCarCost_carShowNull_DataException() throws DataException {
        сonsultant.maximumCarCost(carShowNull);
    }

    @Test
    public void testMaximumCarCost1() {

        List<Car> expResult = Arrays.asList(bmwCar2);
        
        try {
            List<Car> result = сonsultant.maximumCarCost(carShow);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }

    }

    @Test
    public void testMaximumCarCost2() {

        List<Car> expResult = Arrays.asList(audiCar2, bmwCar2);

        try {
            List<Car> result = сonsultant.maximumCarCost(carShow2);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }
    }

    //Test of minimumCarCost method, of class Consultant.
    @Test(expected = DataException.class)
    public void testMinimumCarCost_carShowNull_DataException() throws DataException {
        сonsultant.maximumCarCost(carShowNull);
    }

    @Test
    public void testMinimumCarCost1() {
        List<Car> expResult = Arrays.asList(audiCar);

        try {
            List<Car> result = сonsultant.minimumCarCost(carShow);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }
    }

    @Test
    public void testMinimumCarCost2() {
        List<Car> expResult = Arrays.asList(bmwCar, audiCar);

        try {
            List<Car> result = сonsultant.minimumCarCost(carShow2);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }
    }

    //Test of searchByYear method, of class Consultant.
    @Test(expected = DataException.class)
    public void testSearchByYear_carShowNull_DataException() throws DataException {
        сonsultant.searchByYear(carShowNull, 2017);
    }

    @Test(expected = DataException.class)
    public void testSearchBy_YearLess_DataException() throws DataException {
        сonsultant.searchByYear(carShow, 1450);
    }

    @Test
    public void testSearchByYear1() {
        List<Car> expResult = Arrays.asList(bmwCar2);

        try {
            List<Car> result = сonsultant.searchByYear(carShow2, 2019);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }
    }

    @Test
    public void testSearchByYear2() {
        List<Car> expResult = Arrays.asList(audiCar, lorryBus2);

        try {
            List<Car> result = сonsultant.searchByYear(carShow2, 2017);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }
    }

    @Test
    public void testSearchByYear3() {

        List<Car> expResult = new LinkedList<>();

        try {
            List<Car> result = сonsultant.searchByYear(carShow2, 2005);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }
    }

    //Test of maximumCargoCapacity method, of class Consultant.
    @Test(expected = DataException.class)
    public void testMaxCargoCapacity_carShowNull_DataException() throws
            DataException {
        сonsultant.maximumCarCost(carShowNull);
    }

    @Test
    public void testMaximumCargoCapacity() {

        List<Car> expResult = Arrays.asList(lorryBus2);

        try {
            List<Car> result = сonsultant.maximumCargoCapacity(carShow2);
            assertEquals(expResult, result);
        } catch (DataException e) {
            LOG.warn("DataException has occured", e);
        }
    }

}
