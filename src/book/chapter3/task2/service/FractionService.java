package book.chapter3.task2.service;

import book.chapter3.task2.model.Fraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FractionService {
    public static List<Double> countFractions(List<Fraction> doubles) {
        List<Double> result = new ArrayList<>();
        Iterator<Fraction> makeFractions = doubles.iterator();
        while(makeFractions.hasNext()) {
            Fraction fraction = makeFractions.next();
            double tmpFraction = fraction.getNumerator() / fraction.getDenominator();
            result.add(tmpFraction);
        }

        return result;
    }

}
