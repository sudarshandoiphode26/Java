package sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private int id;
    private String name;

    public Student() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentId: " + this.id + " StudentName: " + this.name;
    }
}

class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId() > o2.getId()) return 1;
        if (o1.getId() < o2.getId()) return -1;
        return 0;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Sachin");
        Student s2 = new Student(1, "Amar");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        //Before sorting
        System.out.println("Before sorting");
        for (Student s : list) {
            System.out.println(s.toString());
        }

        Collections.sort(list, new NameComparator());

        System.out.println("After sorting");
        for (Student s : list) {
            System.out.println(s.toString());
        }

    }
}
