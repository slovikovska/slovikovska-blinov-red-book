package book.chapter3.task3.main;

import book.chapter3.task3.model.Patient;
import book.chapter3.task3.service.PatientService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients =  new ArrayList<>();
// id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
        patients.add(new Patient(0001L, "Dostoyevskiy", "Fedor", "M", "Monte Carlo", "999 555 333", "MP-99543-21", "Schizophrenia"));
        patients.add(new Patient(0002L, "Newton", "Isac", "London", "999 555 333", "MP-99543-23", "Partial blindness"));
        patients.add(new Patient(0003L, "Bach", "Johan", "Sebastian", "Leipzig", "999 555 333", "MP-99543-32", "Partial blindness"));
        patients.add(new Patient(0004L, "Handel", "George", "Fridriech", "London", "999 555 333", "MP-99543-35", "Obesity"));
        patients.add(new Patient(0003L, "Goya", "Anselmo", "Barselona", "999 555 333", "MP-99543-38", "Schizophrenia"));

        System.out.println(PatientService.findDiagnosis("Schizophrenia", patients));
        System.out.println(PatientService.findMedicalPaper(20, 33, patients));
    }
}
