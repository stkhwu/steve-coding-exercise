package revision.classexercise.java7method.exercise13.src;

/**
 * Expected Output:
 * Running as fast as it can!
 * Speed: 150
 * Speed: 120, carModel: ModelX
 */
public class Exercise13 {

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("Running as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void printSpeed(int speed) {
        System.out.println("Speed: " + speed);
    }

    // Create method with same name, but with different parameters
    public String printSpeed(int speed, String model) {
        return "Speed: " + speed + ", carModel: " + model;
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Exercise13 myCar = new Exercise13(); // Create a myCar object
        myCar.fullThrottle(); // Call the fullThrottle() method
        myCar.printSpeed(150); // Call the speed() method
        String str = myCar.printSpeed(120, "ModelX"); // Overriding
        System.out.println(str);
    }
}
