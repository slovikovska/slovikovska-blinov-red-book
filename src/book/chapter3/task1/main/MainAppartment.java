package book.chapter3.task1.main;

import book.chapter3.task1.model.Appartment;
import book.chapter3.task1.service.AppartmentService;

import java.util.ArrayList;
import java.util.List;

public class MainAppartment {
    public static void main(String[] args) {
        // id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации
        List<Appartment> appartments = new ArrayList<>();
        appartments.add(new Appartment(1, 245, 890, 9, 4, "Green St.", "residental", 100));
        appartments.add(new Appartment(2, 200, 1200, 5, 8, "Green St.", "residental", 100));
        appartments.add(new Appartment(3, 240, 1100, 8, 6, "Green St.", "residental", 100));
        appartments.add(new Appartment(4, 210, 615, 3, 3, "Green St.", "residental", 100));
        appartments.add(new Appartment(5, 280, 780, 15, 4, "Green St.", "residental", 100));
        appartments.add(new Appartment(6, 282, 890, 16, 5, "Green St.", "residental", 100));
        appartments.add(new Appartment(7, 290, 1120, 18, 7, "Green St.", "residental", 100));
        appartments.add(new Appartment(8, 296, 990, 20, 4, "Green St.", "residental", 100));
        appartments.add(new Appartment(9, 269, 1250, 11, 9, "Green St.", "residental", 100));

        System.out.println(AppartmentService.sortByNumberOfRooms(appartments, 5));
        System.out.println(AppartmentService.sortByNumberOfRoomsOnLevel(appartments, 4, 5, 15));
        System.out.println(AppartmentService.sortBySquare(appartments, 800));
    }


}
