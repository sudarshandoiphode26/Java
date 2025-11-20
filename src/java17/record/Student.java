package java17.record;

record Student(int id, String name) {

    //Default constructor
    public Student(){
        this(0, "Unknown");
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Sachin");
        Student s2 = new Student();

        //Getter
        System.out.println(s2.id() + " " +s2.name());
    }
}

// Record class are by default final means they can not be extended
// Record class declares fields final means once instantiated they can not be changed
// Record class extends Record means it can not extend any other class
// Record class provides getter, toString, parameterized constructor, equals, hashcode methods
// Record can be used for DTO as DTO objects are immutable
