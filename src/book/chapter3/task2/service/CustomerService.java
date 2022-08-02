package book.chapter3.task2.service;
import book.chapter3.task2.model.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CustomerService {
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
}
