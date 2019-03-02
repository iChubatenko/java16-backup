package pl.mpas.advanced_programing.comparing.cars;

import java.util.Comparator;

public class CarBrandComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

        return o1.getColor().compareTo(o2.getColor());
    }
}