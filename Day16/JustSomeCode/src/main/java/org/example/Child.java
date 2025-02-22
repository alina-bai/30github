package org.example;

class Child extends Parent {
    String name = "Child"; // This variable hides Parent's name variable

    @Override
    void show() { // Overriding the show() method
        System.out.println("Child show() method");
    }

    static void staticMethod() { // Hiding Parent's static method
        System.out.println("Child staticMethod()");
    }

    void displaySuper() {
        System.out.println("Parent's name: " + super.name); // Accessing Parent's variable
        super.show(); // Calling Parent's overridden method
    }
}
