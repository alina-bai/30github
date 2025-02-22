package org.example;
public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show(); // Calls Parent's show()
        obj1.staticMethod(); // Calls Parent's staticMethod()

        Parent obj2 = new Child(); // Reference variable type is Parent, but object is Child
        obj2.show(); // Calls Child's overridden show() (dynamic binding)
        obj2.staticMethod(); // Calls Parent's staticMethod() (method hiding, static methods don't override)

        Child obj3 = new Child();
        obj3.show(); // Calls Child's show()
        obj3.staticMethod(); // Calls Child's staticMethod()
        obj3.displaySuper(); // Demonstrates "super" keyword usage
    }
}
