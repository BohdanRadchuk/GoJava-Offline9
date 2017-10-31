import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        HashSet<Student> studentSet = new HashSet<>();

        Student student = new Student("Asd", 1);
        Student student1 = new Student("QWE", 1);
        Student student2 = new Student("ASGQ", 1);
        Student student3 = new Student("AOHSF", 1);
        Student student4 = new Student("ASJKF", 2);
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        student.printStudents(arrayList , 2);

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);


    }
}
