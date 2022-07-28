package BookChapter3Task1.Main;

import BookChapter3Task1.Model.Student;
import BookChapter3Task1.Service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Turner", "Adair", "M", 2002, "London City", "0984455612300", "Economics", 1, "E-11");
        Student student2 = new Student(2, "Watt", "James", "Hosmer", 2001, "Glasgow", "0984455612300", "Mechanics", 2, "M-21");
        Student student3 = new Student(3, "Fridman", "Milton", 1999, "Economics", 3, "E-31");
        Student student4 = new Student(4, "Soros", "George", 2001, "Economics", 2, "E-21");
        Student student5 = new Student(5, "Edison", "Thomas", "Alva", 2002, "Menlo Park", "0984455612300", "Mechanics", 1, "M-11");
        Student student6 = new Student(6, "Bessemer", "Henry", "W", 2000, "Sheffield", "0984455612300", "Mechanics", 2, "M-21");
        Student student7 = new Student(7, "Newton", "Isac", 2001, "Mechanics", 3, "M-31");
        Student student8 = new Student(8, "Morse", "John", "M", 2002, "NY City", "0984455612300", "Mechanics", 1, "M-11");
        Student student9 = new Student(9, "Smith", "Adam", 2000, "Economics", 2, "E-21");
        Student student10 = new Student(10, "Cains", "John", "Mainard", 1998, "London City", "0984455612300", "Economics", 4, "E-41");
        List<Student>students = List.of(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);

        System.out.println(StudentService.findStudentsByFaculty("Mechanics", students));
        System.out.println(StudentService.findStudentsByFacultyAndYear("Economics", 2, students));

    }
}
