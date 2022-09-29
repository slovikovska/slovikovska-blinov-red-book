package book.chapter3.task2.main;

import book.chapter3.task2.model.Element;

import java.util.ArrayList;
import java.util.List;

public class MainElement {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Element(2.3, 1.2, 14, 22L, 15));
        elements.add(new Element(4.5, 8.3, 12, 54L, 34));
        elements.add(new Element(4.8, 2.6, 44, 23L, 80));
        elements.add(new Element(1.7, 3.6, 45, 56L, 90));

        System.out.println(elements);
    }

}
