package tech.kuba.sda.interfejsfunkcyjny;

import java.util.Scanner;

public class ProgramowanieFunkcyjne {

    public static void main(String[] args) {
        String next = new Scanner(System.in).next();
        OperatorBinarny operator;
        String txt = "ABCD";
        if (next.equals("+")) {
            operator = (a , b) -> { //wyrazenie lambda, w nawiasach klamrowych mozemy wrzucic wiecej funkcji
                System.out.println(txt);
                System.out.printf("Dodajemy %d i %d%n", a ,b);
                return a + b;
            };
        } else if (next.equals("-")){
            operator = (a, b) -> a - b; //stosuje sie tylko w przypadku interfejsu funkcyjnego
        } else {
            throw new RuntimeException();
        }
        uruchom(operator);
    }

    public static void uruchom(OperatorBinarny operator) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = operator.wykonaj(a, b);
        System.out.println(i);
    }
}
