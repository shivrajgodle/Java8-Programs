package org.example.functionalInterface;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (i) -> i.getGradeLevel() >= 3;

    static Predicate<Student> p2 = (i) -> i.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel(){
        System.out.println("In filterStudentByGradeLevel");
        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println("filter Student By Grade Level is"+student);
            }
        });
    }

    public static void filterStudentByGpa(){
        System.out.println("In filterStudentByGpa");
        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println("filter Student By Gpa Level is"+student);
            }
        });
    }

    public static void filterStudentByGradeLevelAndGpa(){
        System.out.println("In filterStudentByGradeLevelAndGpa");
        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println("filter Student By Grade Level AND Gpa is"+student);
            }
        });
    }

    public static void filterStudentByGradeLevelORGpa(){
        System.out.println("In filterStudentByGradeLevelORGpa");
        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(student -> {
            if(p1.or(p2).test(student)){
                System.out.println("filter Student By Grade Level OR Gpa is"+student);
            }
        });
    }

    public static void filterStudentByGradeLevelORGpaNegate(){
        System.out.println("In filterStudentByGradeLevelORGpaNegate");
        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println("filter Student By Grade Level Negate Gpa is"+student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudentByGradeLevelAndGpa();
        filterStudentByGradeLevelORGpa();
        filterStudentByGradeLevelORGpaNegate();
    }

}
