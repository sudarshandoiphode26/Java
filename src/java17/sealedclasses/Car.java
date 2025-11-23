package java17.sealedclasses;

// Sealed classes helps in defining which classes and interfaces can extend sealed class
sealed class Car permits Scoda, Honda {
    void start() {
        System.out.println("Starting Car");
    }
}

//Scoda can not be extended further
final class Scoda extends Car {
    void run(){
        System.out.println("Running Scoda");
    }
}

/*
Over here you will get compile time error as toyota is permitted to extend behavior of car class
final class Toyota extends Car {

}*/

// Honda can be further gets extended
non-sealed class Honda extends Car {
    void run(){
        System.out.println("Running Honda car");
    }
}

class Main {
    public static void main(String[] args) {
        Scoda s1 = new Scoda();
        s1.start();
        s1.run();

        Honda h1 = new Honda();
        h1.run();
        h1.start();
    }
}