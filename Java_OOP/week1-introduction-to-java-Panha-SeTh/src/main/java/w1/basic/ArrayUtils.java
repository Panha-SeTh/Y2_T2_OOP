package w1.basic;

public class ArrayUtils {
    public static int sum(int a[]){
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    public static int max(int a[]){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int[] sort(int a[]){
        int[] result = a.clone();
        for (int i = 0; i < result.length - 1; i++)
            for (int j = 0; j < result.length - 1 - i; j++)
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
        return result;
    }
}
