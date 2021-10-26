package JavaCore_2_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] positiveEven = number(x);
        int[] sorte = sort(positiveEven);
        System.out.println(Arrays.toString(sorte));

    }

    public static int[] number(int[] x) {
        int positiveNumbers = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0 && x[i] % 2 == 0) {
                positiveNumbers++;
            }
        }
        int[] b = new int[positiveNumbers];
        int evenNumbers = 0;
        for (int j = 0; j < x.length; j++) {
            if (x[j] > 0 && x[j] % 2 == 0) {
                b[evenNumbers++] = x[j];
            }
        }
        return b;
    }

    public static int[] sort(int[] x) {
        for (int i = x.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                int a = x[i];
                if (a < x[j]) {
                    int c = x[j];
                    x[i] = c;
                    x[j] = a;

                }
            }
        }
        return x;
    }
}


