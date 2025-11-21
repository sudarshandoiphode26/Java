package sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(){

    }

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.id>o.id) return 1;
        if(this.id<o.id) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "StudentId: "+ this.id + " StudentName: "+this.name;
    }
}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student(10, "Sachin");
        Student s2 = new Student(1, "Sachin");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        //Before sorting
        System.out.println("Before sorting");
        for (Student s: list){
            System.out.println(s.toString());
        }


        Collections.sort(list);

        System.out.println("After sorting");

        //after sorting byId
        for (Student s: list){
            System.out.println(s.toString());
        }

    }
}
