package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.Optional;

public class StreamMapReduceExample {

    public static Optional<Integer> getStudentMapReduceList(){
       return StudentDatabase.getAllStudent().stream()
               .filter((student) -> student.getGradeLevel() >= 3)
               .filter((student) -> student.getGender().equals("female"))
               .map(Student::getNoteBooks)
               .reduce((s1,s2)-> s1+s2);
    }

    public static void main(String[] args) {
        System.out.println(getStudentMapReduceList().get());
    }
}
