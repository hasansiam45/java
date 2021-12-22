package linkList;

import java.util.LinkedList;

public class StudentList {
    public static void main(String[] args) {
        // create a linked list for student csass
        LinkedList<Student> list = new LinkedList<>();
        Student s1 = new Student(1, 11, "Siam");
        Student s2 = new Student(2, 11, "Hasan");
        Student s3 = new Student(3, 11, "Jahid");
        Student s4 = new Student(4, 11, "JHjsbcs");
        Student s5 = new Student(5, 11, "Sdfsiam");
        Student s6 = new Student(6, 11, "Sdsdgdiam");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        for (Student s: list) {
            System.out.println(s.id + " " + s.name + " " + s.className);
        }
    }
}
