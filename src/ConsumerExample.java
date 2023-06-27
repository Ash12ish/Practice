import StudentData.Student;
import StudentData.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {


    public static void printStudentDetails() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Consumer<Student> studentName = (student) -> System.out.println(student);
        studentList.forEach(studentName);


    }


    public static void printStudentNameAndActivities()
    {
        List<Student> studentNameList= StudentDataBase.getAllStudents();
        Consumer<Student> studentActivities = (student) -> System.out.println(student.getActivities());
        Consumer<Student> studentNames=(student)-> System.out.println(student.getName());
        studentNameList.forEach(studentActivities.andThen(studentNames) );

    }

    public static void main(String args[]) {

        Consumer<String> consume = (s) -> {
            System.out.println(s.toUpperCase());
        };

        consume.accept("Consumer in java 8");
        System.out.println("Consumer " + consume);

        printStudentDetails();
        printStudentNameAndActivities();
    }
}
