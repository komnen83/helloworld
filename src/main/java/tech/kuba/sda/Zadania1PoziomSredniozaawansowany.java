package tech.kuba.sda;

public class Zadania1PoziomSredniozaawansowany {
    public static void main(String[] args) {

        printFlagUSA();

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

        System.out.println(factorialRecurency(5) + "\n");

        System.out.println("Silnia " + factorial(5) + "\n");

        System.out.println(calculateSecondsToTime(86410));

        int[] arr = {1, 45, 564, 7867, 34, 5456, 210};
        System.out.println(reverseTable(arr));

        int[] arr1 = {1, 2, 3, 4, 5, 2, 1};
        System.out.println(palindrom(arr1));

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

    public static void printFlagUSA() {
        int allRows = 15;
        int starRows = 9;
        int bottomRest = allRows - starRows; // 6
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 6; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int m = 1; m <= 5; m++) {
                    System.out.print(" *");
                }
                System.out.print("  ");
            }
            for (int k = 1; k <= 34; k++) {
                System.out.print("=");
            }

            System.out.println();
        }
        int row = 6;
        int columns = 46;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }


    public static int factorialRecurency(int n) {
        return (n == 0) ? 1 : n * factorialRecurency(n - 1);
    }

    public static int factorial(int n) {
        int a = 1;
        if (n == 0) {
            return a;
        } else {
            for (int i = 2; i <= n; i++) {
                a = a * i;
            }
        }
        return a;
    }

    public static String calculateSecondsToTime(int numberOfSeconds) {
        int secondsInHour = 3600;
        int secondsInMinute = 60;
        int hours = numberOfSeconds / secondsInHour;
        int minutes = (numberOfSeconds % secondsInHour) / secondsInMinute;
        int secondsInHourAndMinute = (hours * secondsInHour) + (minutes * secondsInMinute);
        int seconds = (numberOfSeconds - secondsInHourAndMinute);
        String time = ("\"" + hours + ":" + minutes + ":" + seconds + "\"");
        return time;
    }

    public static int reverseTable(int[] arr) {
        int result = 0;
        for (int i = arr.length - 1; i >= result; i--) {
            System.out.print(arr[i] + " ");
        }
        return result;
    }

    public static boolean palindrom(int[] arr) {
        if (arr[0] == arr[arr.length - 1]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        return true;
    }
}
