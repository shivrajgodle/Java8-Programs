package org.example.streams;

import org.example.data.StudentDatabase;

public class StreamMatchExample {

    public static boolean isAllMatch(){
        return StudentDatabase.getAllStudent()
                .stream()
                .allMatch((student)-> student.getGpa() >= 3.5);
    }

    public static boolean isAnyMatch(){
        return StudentDatabase.getAllStudent()
                .stream()
                .anyMatch((student)-> student.getGpa() >= 4.0);
    }

    public static boolean isNonMatch(){
        return StudentDatabase.getAllStudent()
                .stream()
                .anyMatch((student)-> student.getGpa() >= 9.0);
    }

    public static void main(String[] args) {
        System.out.println("isAllMatch is:-"+isAllMatch());

        System.out.println("isAnyMatch is:-"+isAnyMatch());

        System.out.println("isNonMatch is:-"+isNonMatch());
    }

}
