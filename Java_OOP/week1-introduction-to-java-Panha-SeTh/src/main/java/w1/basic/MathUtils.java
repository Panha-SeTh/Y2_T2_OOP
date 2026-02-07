package w1.basic;

public class MathUtils {
    public static int add(int a, int b){
        return a + b;
    }

    public static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static boolean isEven(int a){
        return a % 2 == 0;
    }

    public static int factorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
