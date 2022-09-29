package book.chapter3.task1.main;

import book.chapter3.task1.model.Customer;
import book.chapter3.task1.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class MainCustomer {
    public static void main(String[] args) {
        //id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1L, "Turner", "Adair", "M", "London City", 3407392585294850284L, 2664L));
        customers.add(new Customer(2L, "Turner", "Adair", "M", "London City", 3407392585294850284L, 4664L));
        customers.add(new Customer(3L, "Teech", "Edward", 3407392585294850286L, 4669L));
        customers.add(new Customer(4L, "Edison", "Thomas", "Alva", "Menlo Park", 3407392585294850283L, 4663L));
        customers.add(new Customer(5L, "Klinton", "William", "Jefferson", "NY City", 3407392585294850288L, 4661L));
        customers.add(new Customer(6L, "Reagan", "Ronald", 3407392585294850279L, 4660L));
        System.out.println(CustomerService.sortBankAccounts(4650L, 4661L, customers));
        System.out.println(CustomerService.sortAlphabetically(customers));

    }
}
