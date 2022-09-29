package book.chapter3.task2.service;

import book.chapter3.task2.model.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElementService {
    public static List<Element> AddToEvenElements( List<Element> elements) {
        List<Element> result = new ArrayList<>();
        Iterator<Element> findObjectInElements = elements.iterator();
        while(findObjectInElements.hasNext()) {
            Element element = findObjectInElements.next();
            for(int i = 0; i < elements.size(); i++) {
               if (elements.indexOf(i)%2 == 0) {

               }
            }
            // int retval=arrlist.indexOf("E");
        }
        return result;
    }


}
