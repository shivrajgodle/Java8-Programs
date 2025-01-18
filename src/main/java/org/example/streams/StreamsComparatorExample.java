package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> getSortedStudentByName(){
        return StudentDatabase.getAllStudent()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> getSortedStudentByGPA(){
        return StudentDatabase.getAllStudent()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> getSortedStudentByGPADesc(){
        return StudentDatabase.getAllStudent()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Student sorted by Name");
        getSortedStudentByName().forEach(System.out::println);

        System.out.println("Student sorted by GPA");
        getSortedStudentByGPA().forEach(System.out::println);

        System.out.println("Student sorted by GPA Desc");
        getSortedStudentByGPADesc().forEach(System.out::println);
    }
}
