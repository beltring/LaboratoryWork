package by.bntu.fitr.poisit.beltring.task6.model.entity;

import by.bntu.fitr.poisit.beltring.task6.model.logic.BusStationLogic;
import by.bntu.fitr.poisit.beltring.task6.util.Initializer;
import java.util.concurrent.Callable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Bus implements Callable<Boolean> {

    private int threadName;
    private BusStation busStation;
    //private Thread thread;

    public Bus(BusStation busStation) {
        threadName = Initializer.newThreadId();
        this.busStation = busStation;
        //thread = new Thread(this);
        //thread.start();
    }
    public int getThreadName() {
        return threadName;
    }

    public void setBusStation(BusStation busStation) {
        this.busStation = busStation;
    }
    
    private static final Logger LOG = LogManager.getLogger(BusStationLogic.class);

    @Override
    public Boolean call() {
        
        if (BusStation.getLock().tryLock()) {

                BusStation.arrive(this,busStation);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bus{" + "threadName=" + threadName
                + ", busStation=" + busStation + '}';
    }

}
