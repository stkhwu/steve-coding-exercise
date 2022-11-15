package revision.classexercise.java9enum.exercise17.src;

enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // Write a switch statement to print the expected output.
        switch (myVar) {
            case LOW:
                System.out.println("This is Low level");
                System.out.println("enum is " + Level.LOW + ", and its value is " + Level.LOW.value);
                break;

            case MEDIUM:
                System.out.println("This is Medium level");
                System.out.println("enum is " + Level.MEDIUM + ", and its value is " + Level.MEDIUM.value);
                break;

            case HIGH:
                System.out.println("This is High level");
                System.out.println("enum is " + Level.HIGH + ", and its value is " + Level.HIGH.value);
                break;

            default:
                break;
        }

    }
}