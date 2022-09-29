package book.chapter3.task2.main;

import book.chapter3.task2.model.Complex;
import book.chapter3.task2.service.ComplexService;

import java.util.ArrayList;
import java.util.List;

public class MainComplex {
    public static void main(String[] args) {
        List<Complex> complexCoordinates = new ArrayList<>();
        complexCoordinates.add(new Complex(25, 10, 12));
        complexCoordinates.add(new Complex(0, 15, 10));
        complexCoordinates.add(new Complex(93, 17, 35));

        System.out.println(ComplexService.addCoordinates(complexCoordinates));
        System.out.println(ComplexService.multiplyCoordinates(complexCoordinates));
    }
}
