package BookChapter3Task1.Service;

import BookChapter3Task1.Model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    public static List<Student> findStudentsByFaculty(String faculty, List<Student>allStudents){
        ArrayList<Student> result = new ArrayList<>();
        Iterator sortByFaculty = allStudents.iterator();
        while(sortByFaculty.hasNext()) {
            Student student = (Student)sortByFaculty.next();
            if (student.getFaculty().equals(faculty)) {
                result.add(student);
            }
        }
        return result;
    }

    public static List<Student> findStudentsByFacultyAndYear(String faculty, int year, List<Student>allStudents){
        ArrayList<Student> result = new ArrayList<>();
        Iterator sortByFacultyYear = allStudents.iterator();
        while(sortByFacultyYear.hasNext()) {
            Student student = (Student)sortByFacultyYear.next();
            if (student.getFaculty().equals(faculty) && student.getStudyYear() == year) {
                result.add(student);
            }
        }
        return result;
    }
}
