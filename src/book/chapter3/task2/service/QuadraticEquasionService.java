package book.chapter3.task2.service;

import book.chapter3.task2.model.QuadraticEquasion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuadraticEquasionService {
    public static List<Double> countRoots(List<QuadraticEquasion> abcValues) {
        List<Double> result = new ArrayList<>();
        Iterator<QuadraticEquasion> sortValues = abcValues.iterator();
        while (sortValues.hasNext()) {
            QuadraticEquasion value = sortValues.next();
            double discriminantTmp = (value.getB() * value.getB()) - (4 * value.getA() * value.getC());
            double discriminant =  Math.sqrt(discriminantTmp);
            switch(discriminant) {

            }


        }





        return result;
    }
}
