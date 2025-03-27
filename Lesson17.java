package Lesson17;

public class Lesson17 {
    public static boolean ravenstva(StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i=0; i < sb1.length(); i++) {
                if(sb1.charAt(i) != sb2.charAt(i)) {
                    result=false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;

    }

}


