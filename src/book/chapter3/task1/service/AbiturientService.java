package book.chapter3.task1.service;

import book.chapter3.task1.model.Abiturient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AbiturientService {
    public static List<Abiturient> findAbiturientWithLowGrades(List<Abiturient> allAbiturients, int min) {
        List<Abiturient> result = new ArrayList<>();
        Iterator <Abiturient> sortByGrade = allAbiturients.iterator();
        while (sortByGrade.hasNext()) {
            Abiturient abiturient = sortByGrade.next();
            Iterator<Integer> findLower = Arrays.stream(abiturient.getMarks()).iterator();
            while (findLower.hasNext()) {
                Integer i = findLower.next();
                if (i <= min) {
                    result.add(abiturient);
                }
            }

        }

        return result;
    }

    public static List<Abiturient> findAbiturientsWithHighGrades(List<Abiturient> allAbiturients, int maxGrade) {
        List<Abiturient> result = new ArrayList<>();
        Iterator<Abiturient> sortByGrade = allAbiturients.iterator();
        while(sortByGrade.hasNext()) {
            Abiturient abiturient = sortByGrade.next();
            Iterator<Integer> findMaxGrade = Arrays.stream(abiturient.getMarks()).iterator();
            int j = 0;
            while (findMaxGrade.hasNext()) {
                Integer i = findMaxGrade.next();
                j = j + i;
            }
            if(j > maxGrade) {
                result.add(abiturient);
            }
        }
        return result;
    }

    public static List<Abiturient> findNAbiturientsWithHighestGrades(List<Abiturient> allAbiturients, int maxGrade, int minGrade) {
        List<Abiturient> result = new ArrayList<>();
        Iterator<Abiturient> sortByGradeSum = allAbiturients.iterator();
        while(sortByGradeSum.hasNext()) {
            Abiturient abiturient = sortByGradeSum.next();
            Iterator<Integer> findMaxGradeSum = Arrays.stream(abiturient.getMarks()).iterator();
            int j = 0;
            while(findMaxGradeSum.hasNext()) {
                Integer i = findMaxGradeSum.next();
                j = j + i;
            }
            if((j <= maxGrade) && (j >= minGrade)) {
                result.add(abiturient);
            }
        }
        return result;
    }
}
