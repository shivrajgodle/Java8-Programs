package org.example.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam",2,3.6,"male", Arrays.asList("swimming","basketball","volleyball"));
    };

    public static List<Student> getAllStudent(){
        Student student1 = new Student("Adam",2,3.6,"male", Arrays.asList("swimming","basketball","volleyball"),11);

        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming","gymnastics","soccer"),12);

        Student student3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming","gymnastics","aerobics"),10);

        Student student4 = new Student("Dave",4,3.9,"male", Arrays.asList("swimming","basketball","soccer"),3);

        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming","dancing","football"),1);

        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming","basketball","baseball","football"),331);

        Student student7 = new Student("James",2,7.1,"male", Arrays.asList("swimming","baseball","football"),331);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6,student7);

        return students;
    }
}
