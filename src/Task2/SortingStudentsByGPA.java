package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA {

    public static void main(String[] args)
    {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student((int) (Math.random()*10)));
        students.add(new Student((int) (Math.random()*10)));
        students.add(new Student((int) (Math.random()*10)));
        students.add(new Student((int) (Math.random()*10)));
        students.add(new Student((int) (Math.random()*10)));

        Comparator<Student>comp=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.GPA <= o2.GPA ? 1 : -1;
            }
        };
        for (int i =0; i < students.size(); i++)
            System.out.println(students.get(i).getGPA());
        System.out.println("\nSorted:");

        Collections.sort(students, comp);
        for (int i =0; i < students.size(); i++)
            System.out.println(students.get(i).getGPA());
    }
}
