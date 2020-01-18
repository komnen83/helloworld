package tech.kuba.sda.interfejsfunkcyjny;

public class Dodawanie implements OperatorBinarny {
    @Override
    public int wykonaj(int a, int b) {
        return a + b;
    }
}
