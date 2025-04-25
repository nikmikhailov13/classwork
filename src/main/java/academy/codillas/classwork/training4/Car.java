package academy.codillas.classwork.training4;

import java.util.Comparator;

// Immutability / immutable objects

public class Car implements Comparable<Car> {

    public static final Comparator<Car> ENGINE_CAPACITY_COMPARATOR =
            Comparator.comparingDouble(Car::getEngineCapacity);

    private final int yearOfManufacture;
    private final double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(
                getYearOfManufacture(),
                otherCar.getYearOfManufacture()
        );
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}