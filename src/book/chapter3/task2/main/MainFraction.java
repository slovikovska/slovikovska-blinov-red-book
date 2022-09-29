package book.chapter3.task2.main;

import book.chapter3.task2.model.Fraction;
import book.chapter3.task2.service.FractionService;

import java.util.ArrayList;
import java.util.List;

public class MainFraction {
    public static void main(String[] args) {
        List<Fraction> fractionsList = new ArrayList<>();
        fractionsList.add(new Fraction(1, 4));
        fractionsList.add(new Fraction(6, 8));
        fractionsList.add(new Fraction(5, 10));
        fractionsList.add(new Fraction(14, 10));
        fractionsList.add(new Fraction(8, 23));
        fractionsList.add(new Fraction(12, 8));
        fractionsList.add(new Fraction(7, 8));


        System.out.println(FractionService.countFractions(fractionsList));



    }
}
