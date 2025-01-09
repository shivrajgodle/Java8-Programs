package org.example.functionalInterface;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> s1 = (student) -> System.out.println(student);
    static Consumer<Student> c1 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());

    public static void printName(){

        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(s1);
    }

    public static void printNamesAndActivities(){
        List<Student> studentList = StudentDatabase.getAllStudent();

        studentList.forEach(c1.andThen(c2));
        System.out.println("----------------");
    }

    public static void printNamesAndActivitiesWithCondition(){
        List<Student> studentList = StudentDatabase.getAllStudent();

        studentList.forEach((student)->{
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                c1.andThen(c2).andThen(s1).accept(student);
            }
        });
    }


    public static void main(String[] args) {

        Consumer<String> C = (s) -> System.out.println(s.toUpperCase());

        C.accept("Java8");

        printName();
        printNamesAndActivities();
        printNamesAndActivitiesWithCondition();
    }
}
