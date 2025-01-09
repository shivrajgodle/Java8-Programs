package org.example.methodrefference;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /****
     * className::methodName
     * */
    static Consumer<Student> c1 = p -> System.out.println(p);

    /****
     * className::instanceMethodName
     * */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDatabase.getAllStudent().forEach(c1);

        StudentDatabase.getAllStudent().forEach(c2);
    }

}
