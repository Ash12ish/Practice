import StudentData.Student;
import StudentData.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {


    static Predicate<Integer> p = i-> (i % 2) == 0;

    static Predicate <Integer> p1 = i-> {return (i%2)==0;};

    static Predicate <Integer> p2 = i->{return (i%2)==0;};

    static Predicate <Student> gradeCheck= student -> student.getGradeLevel()>3;
    static Predicate<Student> gpaComparision  =student->student.getGpa()>3;

    public static void gradeCheck()
    {
        System.out.println("Grade Check");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s->{
    if(gradeCheck.test(s))
    {
        System.out.println("Grade of the student "+s);

    }});
    }
    public static void gpaComparision()
    {
        System.out.println("Gpa Comparision");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s->{
            if(gpaComparision.test(s))
            {
                System.out.println("Grade of the student "+s);

            }});
    }

    //filter students based on predefined condition

    public static void filterStudents()
    {
        System.out.println("filter students ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s-> {
            if(gradeCheck.and(gpaComparision).test(s))
            {
                System.out.println(s);

            }
        });
    }

    public static void main(String args[])
    {


        System.out.println(p.test(10));
        System.out.println(p1.test(2));

        System.out.println("Result of OR operation "+p.or(p1).negate().test(9));

        System.out.println("Result of And operation "+p.and(p1).test(22));

        gradeCheck();
        gpaComparision();
        filterStudents();



    }



}
