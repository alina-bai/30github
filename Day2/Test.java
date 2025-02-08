package Lesson22;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");
        System.out.println("Dog has " + myDog.paw + "paws.");


        Cat myCat = new Cat("Whiskers");
        myCat.sleep();
    }
}
