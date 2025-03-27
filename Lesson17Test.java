package Lesson17;

public class Lesson17Test {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = Lesson17.ravenstva(sb4,sb5);
        System.out.println(a);
        System.out.println(Lesson17.ravenstva(sb4,sb5));
        System.out.println(Lesson17.ravenstva(new StringBuilder(), new StringBuilder()));
        System.out.println(Lesson17.ravenstva(new StringBuilder(), new StringBuilder()));



    }

}
