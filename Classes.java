// This is a simple Java program to demonstrate the concept of classes.

public class Classes {
    
    // Class definition for a simple Dog
    static class Dog {
        // Attributes (fields) of the Dog class
        String name;
        int age;

        // Constructor to initialize a Dog object
        public Dog(String name, int age) {
            this.name = name; // Assign the name parameter to the name field
            this.age = age;   // Assign the age parameter to the age field
        }

        // Method to display the dog's details
        public void displayDetails() {
            System.out.println("Dog's Name: " + name);
            System.out.println("Dog's Age: " + age + " years");
        }

        // Method to simulate the dog barking
        public void bark() {
            System.out.println(name + " says: Woof!");
        }
    }

    public static void main(String[] args) {
        // Create Dog objects
        Dog dog1 = new Dog("Buddy", 3); // Create a Dog named Buddy, age 3
        Dog dog2 = new Dog("Max", 5);    // Create a Dog named Max, age 5

        // Display details of each dog
        dog1.displayDetails(); // Call the displayDetails method for dog1
        dog1.bark();          // Call the bark method for dog1

        System.out.println(); // Print a blank line for separation

        dog2.displayDetails(); // Call the displayDetails method for dog2
        dog2.bark();          // Call the bark method for dog2
    }
}
