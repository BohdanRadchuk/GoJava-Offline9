import java.util.*;

public class Student {
    private String name;
    private int course;


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }



    public String getName(){
        return name;
    }
    public int getCourse(){
        return course;
    }

    public Set<Student> union(Set<Student> set1, Set<Student> set2){

        HashSet <Student> unitedSet= new HashSet<>();

        Iterator<Student> iterator1 = set1.iterator();


        while (iterator1.hasNext()) {

            Student tempStudent1 = iterator1.next();
            Iterator<Student> iterator2 = set2.iterator();
            while (iterator2.hasNext()) {
                Student tempStident2 = iterator2.next();
                if (tempStudent1.getName() != tempStident2.getName() && tempStudent1.getCourse() != tempStident2.getCourse())
                    unitedSet.add(tempStudent1);
            }
        }
        return unitedSet;
    }



    public void printStudents(List<Student> students, int course){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
               Student tempStudent = iterator.next();
            if (tempStudent.getCourse() == course)

                System.out.println(tempStudent.getName());


        }

    }




    static void printCollection(Collection collection) {
        for(Object element : collection)
            System.out.print("" + element + " ");
        System.out.println();
    }

}
