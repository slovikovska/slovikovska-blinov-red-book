package book.chapter3.task1.service;

import book.chapter3.task1.model.Patient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatientService {
    public static List<Patient>findDiagnosis(String diagnosis, List <Patient> allPatients) {
        List <Patient> result = new ArrayList<>();
        Iterator <Patient> findTheDiagnosis = allPatients.iterator();
        while(findTheDiagnosis.hasNext()) {
            Patient patient = findTheDiagnosis.next();
            if (patient.getDiagnosis().equals(diagnosis)) {
                result.add(patient);
            }
        }
        return result;
    }


       /* public static List <Patient> findMedicalPaper(Integer paperNumStart, Integer paperNumFinish, List <Patient> allPatients) {
        List <Patient> result = new ArrayList<>();

        Iterator<Patient> findTheMedPaper = allPatients.iterator();
        while(findTheMedPaper.hasNext()) {
            Patient patient = findTheMedPaper.next();
            Integer medPaperNum = Integer.valueOf(patient.getMedialPaperNumber().substring(9,10));
            if ((medPaperNum > paperNumStart) && (medPaperNum < paperNumFinish)) {
                result.add(patient);
            }
        }
        return result;
    }

        */
       public static List <Patient> findMedicalPaper(Long paperNumStart, Long paperNumFinish, List <Patient> allPatients) {
           List <Patient> result = new ArrayList<>();
           Iterator<Patient> findTheMedPaper = allPatients.iterator();
           while(findTheMedPaper.hasNext()) {
               Patient patient = findTheMedPaper.next();
               if ((patient.getMedicalPaperNumber() > paperNumStart) && (patient.getMedicalPaperNumber() < paperNumFinish)) {
                   result.add(patient);
               }
           }
           return result;
       }
}
