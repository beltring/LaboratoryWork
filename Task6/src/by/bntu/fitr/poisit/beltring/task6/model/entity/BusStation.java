package by.bntu.fitr.poisit.beltring.task6.model.entity;

import by.bntu.fitr.poisit.beltring.task6.util.Initializer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class BusStation {

    private int busStationName;
    private int capacity;
    private int numberOfBuses;

    public BusStation() {
    }

    public BusStation(int capacity, int numberOfBuses) {
        busStationName = Initializer.newBusStationId();
        this.capacity = capacity;
        this.numberOfBuses = numberOfBuses;
    }

    public int getBusStationName() {
        return busStationName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfBuses() {
        return numberOfBuses;
    }

    public void setNumberOfBuses(int numberOfBuses) {
        this.numberOfBuses = numberOfBuses;
    }

    private static final Lock LOCK = new ReentrantLock();
    private static final Logger LOG = LogManager.getLogger(BusStation.class);

    public static Lock getLock() {
        return LOCK;
    }

    public static void arrive(Bus bus, BusStation busStation) {
        int workload = busStation.getNumberOfBuses();

        try {
            LOCK.lock();
            if (busStation.getNumberOfBuses() < busStation.getCapacity()) {
                System.out.println("Bus " + bus.getThreadName() 
                        + " is staying on station " + busStation.getBusStationName());
                LOG.trace("Bus " + bus.getThreadName() + " is staying on station.");
                TimeUnit.MILLISECONDS.sleep(100);
                busStation.setNumberOfBuses(++workload);
            } else {
                System.out.println("Bus " + bus.getThreadName() + " wait...");
                LOG.trace("Bus " + bus.getThreadName() + " wait...");
                busStation.setNumberOfBuses(--workload);
            }
        } catch (InterruptedException e) {
            LOG.error("The program has been interrupted!");
        } finally {
            LOCK.unlock();
        }

    }
    
//    public static ArrayList<Bus> moving(List<Bus> buses, BusStation busStation){
//        for (int i = 0; i < buses.size(); i++) {
//            buses.get(i).setBusStation(busStation);
//        }
//        return (ArrayList<Bus>) buses;
//    }

    @Override
    public String toString() {
        return "BusStation{" + "busStationName=" + busStationName
                + ", capacity=" + capacity
                + ", numberOfBuses=" + numberOfBuses + '}';
    }

}
