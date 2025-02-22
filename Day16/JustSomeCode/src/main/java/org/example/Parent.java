package org.example;

// Demonstrating Reference Variable Type vs Object Type, Binding, Method Overriding,
// Method Hiding, and the "super" keyword.

class Parent {
    String name = "Parent";

    void show() { // This method will be overridden
        System.out.println("Parent show() method");
    }

    static void staticMethod() { // This method will be hidden
        System.out.println("Parent staticMethod()");
    }
}




