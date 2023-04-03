package dkt.edu.javabasic;

public interface Vehicle {
    boolean isStartUp(int fuelCapacity, int batteryCapacity);
    int drive(boolean isStartUp);
}
