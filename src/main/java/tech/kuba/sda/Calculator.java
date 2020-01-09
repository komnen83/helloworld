package tech.kuba.sda;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Oblicz: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] fragments = line.split(" ");

        int num1 = Integer.parseInt(fragments[0]);
        int num2 = Integer.parseInt(fragments[2]);

        if (fragments[1].equals("+")) {
            System.out.println(num1 + num2);
        } else if (fragments[1].equals("*")) {
            System.out.println(num1 * num2);
        } else if (fragments[1].equals("/")) {
            System.out.println(num1 / num2);
        } else if (fragments[1].equals("-")) {
            System.out.println(num1 - num2);
        }
    }
}
