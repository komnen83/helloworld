package tech.kuba.sda.other;

public class CalcApp {
    public static void main(String[] args) {
        Calc calc = new Calc(10, 15);
        calc.setA(10);
        calc.setB(22);
        int x = calc.suma();
        int y = calc.różnica();
        System.out.println("Wynik dodawania " + calc.getA() + " i " + calc.getB() + " wynosi: " + x);
        System.out.println("Wynik odejmowania " + calc.getA() + " i " + calc.getB() + " wynosi: " + y);
    }
}
