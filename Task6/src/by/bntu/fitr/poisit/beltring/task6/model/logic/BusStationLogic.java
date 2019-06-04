package by.bntu.fitr.poisit.beltring.task6.model.logic;

import by.bntu.fitr.poisit.beltring.task6.model.entity.Bus;
import by.bntu.fitr.poisit.beltring.task6.model.entity.BusStation;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class BusStationLogic {
    private static final Lock lock = new ReentrantLock();
    private static final Logger LOG = LogManager.getLogger(BusStationLogic.class);

    public static Lock getLock() {
        return lock;
    }
    
    public static void arrive(Bus bus, BusStation busStation){
        int workload = busStation.getNumberOfBuses();
        lock.lock();
        try {
            if (busStation.getNumberOfBuses() < busStation.getCapacity()) {
                lock.unlock();
                System.out.println("Bus "+ bus.getThreadName() +" is staying on station.");
                LOG.trace("Bus "+ bus.getThreadName() +" is staying on station.");
                TimeUnit.MILLISECONDS.sleep(100);
                busStation.setNumberOfBuses(++workload);
            } else {
                System.out.println("Bus "+bus.getThreadName()+" is going to the next station...");
                LOG.trace("Bus "+bus.getThreadName()+" is going to the next station...");
                busStation.setNumberOfBuses(--workload);
            }
        } catch (InterruptedException e) {
            LOG.error("The program has been interrupted!");
        } finally {
            lock.unlock();
        }

    }
}