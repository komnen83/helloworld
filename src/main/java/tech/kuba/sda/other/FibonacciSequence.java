package tech.kuba.sda.other;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n-ty wyraz ciagu: ");
        String line = scanner.nextLine();

        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        }
        int[] f = new int[n];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n - 1] + f[n - 2];
    }
}
