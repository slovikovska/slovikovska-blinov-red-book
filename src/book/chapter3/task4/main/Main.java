package book.chapter3.task4.main;

import book.chapter3.task4.model.Abiturient;
import book.chapter3.task4.service.AbiturientService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки
        List<Abiturient> abiturients = new ArrayList<>();
        abiturients.add(new Abiturient(1L, "Turner", "Adair", "M", "London City", "333-555-777", new int[]{3, 5, 10, 9, 9}));
        abiturients.add(new Abiturient(2L, "Turner", "Adair", "M", "London City", "333-555-777", new int[]{10, 8, 10, 7, 9}));
        abiturients.add(new Abiturient(3L, "Teech", "Edward", "S", "Virginia", "333-555-777", new int[]{8, 3, 3, 2, 3}));
        abiturients.add(new Abiturient(4L, "Edison", "Thomas", "Alva", "Menlo Park", "333-555-777", new int[]{7, 10, 8, 10, 10}));
        abiturients.add(new Abiturient(5L, "Klinton", "William", "Jefferson", "NY City", "333-555-777", new int[]{5, 7, 8, 7, 9}));
        abiturients.add(new Abiturient(6L, "Reagan", "Ronald", "Jefferson", "Washington, DC", "333-555-777", new int[]{3, 6, 8, 9, 9}));

        System.out.println(AbiturientService.findAbiturientWithLowGrades(abiturients, 5));
        //System.out.println(AbiturientService.findAbiturientsWithHighGrades(abiturients, 30));
        //System.out.println(AbiturientService.findNAbiturientsWithHighestGrades(abiturients, 50, 40));
    }
}
