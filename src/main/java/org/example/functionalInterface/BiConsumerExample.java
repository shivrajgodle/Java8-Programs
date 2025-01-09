package org.example.functionalInterface;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void NameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name,activities) -> {
            System.out.println(name +":"+activities);
        };

        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }



    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) ->{
            System.out.println("a is:-"+a+" & b is:-"+b);
        };

        biConsumer.accept("shiv","raj");

        BiConsumer<Integer,Integer> multiply = (a,b) ->{
            System.out.println("multiply is:-"+(a * b));
        };

        BiConsumer<Integer,Integer> division = (a,b) ->{
            System.out.println("Division is:-"+ (a/b));
        };

        multiply.andThen(division).accept(20,5);

        NameAndActivities();
    }

}
