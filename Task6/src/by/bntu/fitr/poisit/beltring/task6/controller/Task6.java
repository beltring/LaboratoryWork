package by.bntu.fitr.poisit.beltring.task6.controller;

import by.bntu.fitr.poisit.beltring.task6.model.entity.Bus;
import by.bntu.fitr.poisit.beltring.task6.model.entity.BusStation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Task6 {
    private static final Logger LOG = LogManager.getLogger(BusStation.class);
    public static void main(String[] args) {
        final int numberOfThreads = 10;
        
        BusStation firstStation = new BusStation(1, 0);
        BusStation secondStation = new BusStation(1, 0);
        BusStation thirdStation = new BusStation(2, 0);
        BusStation fourthStation = new BusStation(1, 0);
        BusStation fifthStation = new BusStation(2, 0);
        
        List<BusStation> busStaions = new ArrayList<>();
        busStaions.add(firstStation);
        busStaions.add(secondStation);
        busStaions.add(thirdStation);
        busStaions.add(fourthStation);
        busStaions.add(fifthStation);

        Iterator<BusStation> iter = busStaions.iterator();
        ExecutorService service = Executors.newFixedThreadPool(numberOfThreads);
        List<Bus> buses = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            buses.add(new Bus(firstStation));
        }
        
        try {
            while (iter.hasNext()) {
                //BusStation busStation = iter.next();
                service.invokeAll(buses);
                TimeUnit.MILLISECONDS.sleep(200);
                //BusStation.moving(buses, busStation);
                //buses.get(0).setBusStation(secondStation);
            }
        } catch (InterruptedException e) {
            LOG.error("The program has been interrupted!");
        }
        
    }
}
