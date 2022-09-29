package book.chapter3.task1.service;
import book.chapter3.task1.model.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerService {
    //private static String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public static List<Customer> sortBankAccounts(long startPoint, long finishPoint, List<Customer>allCustomers) {
        List <Customer> result = new ArrayList<>();
        Iterator<Customer> sortBankAccount = allCustomers.iterator();
           while(sortBankAccount.hasNext()) {
               Customer customer = sortBankAccount.next();
               if (customer.getBankAccount() > startPoint && customer.getBankAccount() < finishPoint) {
                    result.add(customer);
               }
           }
           return result;
    }

   /* public static List<Customer> sortAlphabetically(String[] abc, List<Customer>allCustomers) {
        List<Customer> result = new ArrayList<>();
        for (int i=0; i <= abc.length; i++) {
            for (int j = 0; j <= allCustomers.size(); j++) {
                Iterator<Customer> sortAbc = allCustomers.iterator();
                    while(sortAbc.hasNext()) {
                        Customer customer = sortAbc.next();
                            if (abc[i].equals(customer.getLastName(charAt(0))) {
                                result.add(customer);
                            }
                    }
            }
        }
    return result;
    }
    */
   public static List<String> sortAlphabetically(List<Customer>allCustomers) {
       List<String> result = new ArrayList<>();
       Iterator<Customer> sortAbc = allCustomers.iterator();
       while(sortAbc.hasNext()) {
           Customer customer = sortAbc.next();
           result.add(customer.getLastName());
       }
       Collections.sort(result);
       return result;
   }


}
