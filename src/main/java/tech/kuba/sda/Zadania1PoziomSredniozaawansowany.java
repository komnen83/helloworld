package tech.kuba.sda;

public class Zadania1PoziomSredniozaawansowany {
    public static void main(String[] args) {

        System.out.println(power(2, 2));
        System.out.println(power(2, 4));
        System.out.println(power(5, 3));
        System.out.println(power(3, 3) + "\n");

        System.out.println(multiply(2, 2) + " ");
        System.out.println(multiply(2, 3, 4) + " ");
        System.out.println(multiply(2, 5, 2, 3) + " ");
        System.out.println(multiply(2, 1, 11, 10) + " " + "\n");

        System.out.println(sumOfDigits(11));
        System.out.println(sumOfDigits(45));
        System.out.println(sumOfDigits(28));
        System.out.println(sumOfDigits(88));

        System.out.println(flagOfUSA() + "\n");

        System.out.println(factorial(5) + "\n");

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(reverseTable(arr));

    }

    public static long power(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++) {
            result = result * a;
        }
        return result;
    }

    public static int multiply(int a, int... b) {
        int result = a;
        for (int i = 0; i < b.length; i++) {
            result = result * b[i];
        }
        return result;
    }

    public static int sumOfDigits(int a) {
        int decimal = 0;
        int rest = a % 10;
        for (int i = 0; i < a / 10; i++) {
            decimal++;
        }
        return decimal + rest;
    }

    public static String flagOfUSA() {
        int star = 9;
        int rest = 6;
        int[][] flag = new int[star][rest];
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < rest; j++) {
                System.out.print("*");
            }
            System.out.println("=");
        }
        System.out.println();
        return "*";
    }

    static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static String calculateSecondsToTime(int numberOfSeconds) {
        return " ";
    }

    public static int reverseTable(int[] arr) {
        int result = 0;
        for (int i = arr.length -1; i >= result; i--) {
            System.out.print(arr[i] + " ");
        }
        return result;
    }
}
