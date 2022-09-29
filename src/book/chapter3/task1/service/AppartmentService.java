package book.chapter3.task1.service;

import book.chapter3.task1.model.Appartment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppartmentService {
    public static List<Appartment> sortByNumberOfRooms(List<Appartment> apartments, int numberOfRooms) {
        List<Appartment> result = new ArrayList<>();
        Iterator<Appartment> findNumberOfRooms = apartments.iterator();
        while (findNumberOfRooms.hasNext()) {
            Appartment apartment = findNumberOfRooms.next();
            if(apartment.getRoomsNumber() == numberOfRooms ) {
                result.add(apartment);
            }
        }
        return result;
    }

    public static List<Appartment> sortByNumberOfRoomsOnLevel(List<Appartment> apartments, int numberOfRooms, long minLevel, long maxLevel) {
        List<Appartment> result = new ArrayList<>();
        Iterator<Appartment> findNumOfRoomsOnLevels = apartments.iterator();
        while (findNumOfRoomsOnLevels.hasNext()) {
            Appartment appartment = findNumOfRoomsOnLevels.next();
            if (appartment.getRoomsNumber() == numberOfRooms) {
                if((appartment.getLevel() >= minLevel) && (appartment.getLevel() <= maxLevel)) {
                    result.add(appartment);
                }
            }
        }
        return result;
    }

    public static List<Appartment> sortBySquare(List<Appartment> apartments, long square) {
        List<Appartment> result = new ArrayList<>();
        Iterator<Appartment> findBySquare = apartments.iterator();
        while(findBySquare.hasNext()) {
            Appartment apartment = findBySquare.next();
            if(apartment.getSquare() > square) {
                result.add(apartment);
            }
        }
        return result;
    }

}
