package BookChapter3Task2.Main;

import BookChapter3Task2.Model.Customer;
import BookChapter3Task2.Service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета
        List<Customer> customers = new ArrayList<>();
        // customers.add(new Customer(1, "Turner", "Adair", "M", "London City", 3407392585294850284L, 63105010381000009126824664L));
        customers.add(new Customer(1, "Turner", "Adair", "M", "London City", 3407392585294850284L, 3181000009126824664L));
        customers.add(new Customer(2, "Teech", "Edward", 3407392585294850286L, 3181000009126824669L));
        customers.add(new Customer(3, "Edison", "Thomas", "Alva", "Menlo Park", 3407392585294850283L, 3181000009126824663L));
        customers.add(new Customer(4, "Klinton", "William", "Jefferson", "NY City", 3407392585294850288L, 3181000009126824661L));
        customers.add(new Customer(5, "Reagan", "Ronald", 3407392585294850279L, 3181000009126824660L));
        //System.out.println(CustomerService.sortBankAccounts(3181000009126824650L, 3181000009126824661L, customers));
    }
}
