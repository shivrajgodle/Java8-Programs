package org.example.functionalInterface;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    static Predicate<Student> p1 = (i) -> i.getGpa() >= 3.9;
    static Predicate<Student> p2 = (i) -> i.getGradeLevel() >= 3;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    static BiConsumer<String, List<String>> bc = (name,activities) -> System.out.println(name+":"+activities);

    Consumer<Student> studentConsumer = (student -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            bc.accept(student.getName(),student.getActivities());
        }
    });


    public static void PrintNameAndActivities(){
        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(student -> bc.accept(student.getName(), student.getActivities()));
    }


    public static void main(String[] args) {
        PrintNameAndActivities();
    }

}
