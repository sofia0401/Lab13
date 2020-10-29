package Task1;
import java.util.ArrayList;

public class Main {

    public static void sort(ArrayList<Student> students) {
        for (int i=0;i<students.size()-1;i++) {
            for (int j=i+1;j<students.size();j++) {
                if (students.get(i).iDNumber>students.get(j).iDNumber) {
                    Student temp=students.get(i);
                    students.set(i,students.get(j));
                    students.set(j,temp);
                }
            }
        }
        for (int i=0;i<students.size();i++)
            System.out.println(students.get(i).getiDNumber());
    }


    public static void main(String[] args)
    {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student((int) (Math.random()*10000)));
        students.add(new Student((int) (Math.random()*10000)));
        students.add(new Student((int) (Math.random()*10000)));
        students.add(new Student((int) (Math.random()*10000)));
        students.add(new Student((int) (Math.random()*10000)));

        sort(students);
    }
}
