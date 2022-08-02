package book.chapter3.task1.model;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String secondName;
    private int birthDate;
    private String address;
    private String phone;
    private String faculty;
    private int studyYear;
    private String group;

    public Student(int id, String lastName, String firstName, String secondName, int birthDate, String address, String phone, String faculty, int studyYear, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.studyYear = studyYear;
        this.group = group;
    }
    public Student(int id, String lastName, String firstName, int birthDate, String faculty, int studyYear, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.faculty = faculty;
        this.studyYear = studyYear;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        StringBuilder studentsList = new StringBuilder("Student{ ");

        studentsList.append("id: ").append(this.id);
        studentsList.append(", Last Name: ").append(this.lastName);
        studentsList.append(", First Name: ").append(this.firstName);
        studentsList.append(", Second Name: ").append(this.secondName);
        studentsList.append(", birthDate: ").append(this.birthDate);
        studentsList.append(", Address: ").append(this.address);
        studentsList.append(", phone: ").append(this.phone);
        studentsList.append(", Faculty: ").append(this.faculty);
        studentsList.append(", Study Year: ").append(this.studyYear);
        studentsList.append(", group: ").append(this.group);
        studentsList.append("} \n");
        return studentsList.toString();
    }
}
