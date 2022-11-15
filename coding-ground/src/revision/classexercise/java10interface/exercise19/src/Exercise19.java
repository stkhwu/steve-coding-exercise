package revision.classexercise.java10interface.exercise19.src;
// Interface
interface Animal {
    void sound(); // interface method (does not have a body)

    void sleep(); // interface method (does not have a body)
}

// Program a class Pig "implements" the Animal interface
class Pig implements Animal{
    public void sound() {
        System.out.println("Wee Wee");
    }
    
    public void sleep() {
        System.out.println("Zzz Zzz");
    }
}

// Program a Class Cat "implements" the Animal interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Meow Meow");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

/**
 * Expected Output:
 * Wee Wee
 * Zzz Zzz
 * Meow Meow
 * Zzz
 */
class Exercise19 {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.sound(); // print sound by System.out.println
        myPig.sleep(); // print sleep by System.out.println
        Cat myCat = new Cat(); // Create a Cat object
        myCat.sound(); // print sound by System.out.println
        myCat.sleep(); // print sleep by System.out.println
    }
}