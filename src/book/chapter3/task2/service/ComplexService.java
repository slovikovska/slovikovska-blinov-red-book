package book.chapter3.task2.service;

import book.chapter3.task2.model.Complex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComplexService {
    public static List<Double> addCoordinates(List<Complex> coordinates) {
        List<Double> result = new ArrayList<>();
        Iterator<Complex> sortCoordinates = coordinates.iterator();
        while (sortCoordinates.hasNext()) {
            Complex listObject = sortCoordinates.next();
            result.add(listObject.getX() + listObject.getY() + listObject.getZ());
        }
        return result;
    }

    public static List<Double> multiplyCoordinates(List<Complex> coordinates) {
        List<Double> result = new ArrayList<>();
        Iterator<Complex> sortCoordinates = coordinates.iterator();
        while(sortCoordinates.hasNext()) {
            Complex listObject = sortCoordinates.next();
            result.add(listObject.getX() * listObject.getY() * listObject.getZ());
        }
        return result;
    }
}
