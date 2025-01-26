package org.example.Streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamGroupingByExample {

    public static void groupStudentsGender(){
        Map<String, List<Student>> studentList = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println("studentList is:-"+studentList);
    }

    public static void customizedGroupingExample(){
        Map<String, List<Student>> customizedStudentList = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy((student)-> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println("customizedStudentList is:-"+customizedStudentList);
    }

    public static void main(String[] args) {
        //groupStudentsGender();
        customizedGroupingExample();
    }
}
