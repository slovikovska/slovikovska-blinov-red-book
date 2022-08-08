package book.chapter3.task3.model;

public class Patient {
    // id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
    private Long id;
    private String lastName;
    private String firstName;
    private String secondName;
    private String address;
    private String phoneNumber;
    private String medialPaperNumber;
    private String diagnosis;

    public Patient(Long id, String lastName, String firstName, String secondName, String address, String phoneNumber, String medialPaperNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medialPaperNumber = medialPaperNumber;
        this.diagnosis = diagnosis;
    }

    public Patient(Long id, String lastName, String firstName, String address, String phoneNumber, String medialPaperNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medialPaperNumber = medialPaperNumber;
        this.diagnosis = diagnosis;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMedialPaperNumber() {
        return medialPaperNumber;
    }

    public void setMedialPaperNumber(String medialPaperNumber) {
        this.medialPaperNumber = medialPaperNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        StringBuilder patientList = new StringBuilder("Patient { ");
        patientList.append("id: ").append(this.id);
        patientList.append(", Last Name: ").append(this.lastName);
        patientList.append(" First Name: ").append(this.secondName);
        patientList.append(", Second Name: ").append(this.secondName);
        patientList.append(", Address: ").append(this.address);
        patientList.append(", Phone Number: ").append(this.phoneNumber);
        patientList.append(", Medical Paper Number: ").append(this.medialPaperNumber);
        patientList.append(", Diagnosis: ").append(this.diagnosis);
        patientList.append(" \n");

        return patientList.toString();
    }
}
