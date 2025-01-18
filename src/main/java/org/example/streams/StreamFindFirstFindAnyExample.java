package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.Optional;

public class StreamFindFirstFindAnyExample {

    public static Optional<Student> getFindAnyStudent(){
        return StudentDatabase.getAllStudent()
                .stream()
                .filter((student)-> student.getGpa() >= 3.5)
                .findAny();
    }

    public static Optional<Student> getFindFirstStudent(){
        return StudentDatabase.getAllStudent()
                .stream()
                .filter((student)-> student.getGpa() >= 4.1)
                .findAny();
    }

    public static void main(String[] args) {
        Optional<Student> FindAnyStudent = getFindAnyStudent();

        if(FindAnyStudent.isPresent()){
            System.out.println("FindAnyStudent is:-"+FindAnyStudent.get());
        }


        Optional<Student> FindFirstStudent = getFindFirstStudent();

        if(FindFirstStudent.isPresent()){
            System.out.println("FindFirstStudent is:-"+FindFirstStudent.get());
        }
    }
}
