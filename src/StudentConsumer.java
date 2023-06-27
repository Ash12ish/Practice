import StudentData.Student;
import StudentData.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class StudentConsumer {



    public static void biConsumerCall()
    {

        BiConsumer<String, List<String>> listBiConsumer= (name, activities)->System.out.println("name "+name+" "+"activities"+activities);

        List<Student> listStudent= StudentDataBase.getAllStudents();
        listStudent.forEach(student -> {
            listBiConsumer.accept(student.getName(),student.getActivities());
        });
    }

}
