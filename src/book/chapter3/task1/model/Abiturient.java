package book.chapter3.task1.model;

import java.util.Arrays;

public class Abiturient {
    // id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки
    private long id;
    private String lastName;
    private String firstName;
    private String secondName;
    private String address;
    private String phone;
    private int[] marks;

    public Abiturient(long id, String lastName, String firstName, String secondName, String address, String phone, int[] marks) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String toString() {
        StringBuilder abiturientList = new StringBuilder("Abiturient { ");
        abiturientList.append("ID: ").append(this.id);
        abiturientList.append(", Last Name: ").append(this.lastName);
        abiturientList.append(", First Name: ").append(this.firstName);
        abiturientList.append(", Second Name: ").append(this.secondName);
        abiturientList.append(", Address: ").append(this.address);
        abiturientList.append(", Phone: ").append(this.phone);
        abiturientList.append(", Marks: ").append(Arrays.toString(this.marks));
        abiturientList.append(" \n");
        return abiturientList.toString();
    }
}
