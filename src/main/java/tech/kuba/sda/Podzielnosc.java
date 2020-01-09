package tech.kuba.sda;

public class Podzielnosc {
    public static void main(String[] args) {
        int a = getA();
        int b = getB();
        int i = getSomeNumber();
        if(i % 2 != 0) {
            System.out.println(i + " nie jest podzielne przez 2");
        } else {
            System.out.println(i + " jest podzielne przez 2");
        }

        if (a + b >= 20) {
            System.out.println(a + " + " + b + " jest mniejesze niz 20");
        } else if (a + b == 11) {
            System.out.println(a + " + " + b + " jest rowne 11");
        } else {
            System.out.println(a + " + " + b + " jest wieksze od 20");
        }
    }

    private static int getSomeNumber() {
        return 45;
    }

    private static int getA() {
        return 5;
    }
    private static int getB() {
        return 6;
    }


}
