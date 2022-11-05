package com.revision.classexercise.java6classconstructor.exercise10.src;


/**
 * Expected Output: 8
 */
public class Exercise10 {
    int x; // Create an instance attribute

    // Create a class constructor for the Main class
    public Exercise10() {
        // Set the value for the instance attribute x to expected output
        this.x = 8;
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of this class Exercise10
        System.out.println(new Exercise10().x);
        // Print the value of instance attribute
    }
}
