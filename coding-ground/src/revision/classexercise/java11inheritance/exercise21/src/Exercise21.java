package revision.classexercise.java11inheritance.exercise21.src;
/**
 * Expected Output:
 * Car: Tuut, tuut!
 * Tesla ModelX
 * Vehicle: Tuut, tuut, tuut!
 */
class Vehicle {
    protected String brand = "Tesla"; // Protected Vehicle attribute

    public void honk() { // Vehicle method
        System.out.println("Vehicle: Tuut, tuut, tuut!");
    }
}

// think about the relationship between Car and Vehicle
class Car {
    private String modelName = "ModelY"; // Car attribute
    public String brand;

    // Implement the getModelname() and setModelName()

    public String getModelName() {
        return this.modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    

    // and something else
    public void honk() {
        System.out.println("Car: Tuut, tuut!");
    }

}

class Exercise21 {
    public static void main(String[] args) {
        // Create a myCar object
        Car myCar = new Car();
        // Call the honk() method on the myCar object
        myCar.honk();
        // Display the value of the protected brand attribute (from the Vehicle class)
        // and the value of the modelName from the Car class
        myCar.setModelName("ModelX");
        myCar.brand = new Vehicle().brand;
        System.out.println(myCar.brand + " " + myCar.getModelName());

        Vehicle myVehicle = new Vehicle();
        myVehicle.honk();
    }
}