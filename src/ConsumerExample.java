import StudentData.Student;
import StudentData.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentActivities = (student) -> System.out.println(student.getActivities());
   static  Consumer<Student> studentNames=(student)-> System.out.println(student.getName());

    static  Consumer<Student> studentGrade=(student)-> System.out.println(student.getGradeLevel());


    public static void printStudentDetails() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Consumer<Student> studentName = (student) -> System.out.println(student);
        studentList.forEach(studentName);


    }


    public static void printStudentNameAndActivities()
    {
        List<Student> studentNameList= StudentDataBase.getAllStudents();

        studentNameList.forEach(studentActivities.andThen(studentNames) );

    }

    public static void printOnCondition()
    {
List<Student> studentList = StudentDataBase.getAllStudents();
studentList.forEach((student -> {
    if(student.getGradeLevel()>=3 && student.getGpa()>=3.9)
    {
        studentActivities.andThen(studentNames).andThen(studentGrade).accept(student);
    }
}));
    }

    public static void main(String args[]) {
        StudentConsumer c1 = new StudentConsumer();

        Consumer<String> consume = (s) -> {
            System.out.println(s.toUpperCase());
        };

        consume.accept("Consumer in java 8");
      System.out.println("Consumer " + consume);

       printStudentDetails();
       printStudentNameAndActivities();
        printOnCondition();
        c1.biConsumerCall();

    }
}
