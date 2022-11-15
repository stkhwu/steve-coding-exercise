package revision.classexercise.java7method.exercise14.src;
/**
 * Expected Output:
 * Static methods can be called without creating objects
 * Public methods must be called by creating objects
 */
public class Exercise14 {
    // Static method
    static void myMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // instance method
    public void anotherMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        // 1. Static method
        // Call the static method
        Exercise14.myMethod();

        // 2. Instance Method
        // myPublicMethod(); This would compile an error, why?

        // Create an object of Exercise14
        Exercise14 exercise14 = new Exercise14();
        // Call the public method on the object
        exercise14.anotherMethod();
    }
}
