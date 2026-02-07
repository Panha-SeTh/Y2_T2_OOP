package w1.basic;

public class StringUtils {
    public static int length(String s){
        return s.length();
    }

    public static String toUpper(String s){
        return s.toUpperCase();
    }

    public static String reverse(String s){
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static int wordCount(String s){
        if (s == null || s.isEmpty()) {
            return 0;
        }
        return s.trim().split("\\s+").length;
    }
}
