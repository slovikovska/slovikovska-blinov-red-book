package book.chapter3.task2.model;

public class Customer {
    //id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета
    private Long id;
    private String lastName;
    private String firstName;
    private String secondName;
    private String address;
    private Long cardNumber;
    private Long bankAccount;

    public Customer(Long id, String lastName, String firstName, String secondName, String address, Long cardNumber, Long bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }
    public Customer(Long id, String lastName, String firstName, Long cardNumber, Long bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Long bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public String toString() {
        StringBuilder customersList = new StringBuilder("Customer { ");
        customersList.append("id: ").append(this.id);
        customersList.append(", Last Name: ").append(this.lastName);
        customersList.append(", First Name: ").append(this.firstName);
        customersList.append(", Second Name: ").append(this.secondName);
        customersList.append(", Address: ").append(this.address);
        customersList.append(", Card Number: ").append(this.cardNumber);
        customersList.append(", Bank Account: ").append(this.bankAccount);
        return customersList.toString();
    }
}
