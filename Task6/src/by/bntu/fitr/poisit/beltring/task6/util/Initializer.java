package by.bntu.fitr.poisit.beltring.task6.util;

public class Initializer {

    private static int threadId = 1;
    private static int busStationId = 1;

    public static int newBusStationId() {
        return busStationId++;
    }

    public static int newThreadId() {
        return threadId++;
    }
}
