package tech.kuba.sda.firma;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double wynagrodzenie;

    public Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wynagrodzenie=" + wynagrodzenie +
                '}';
    }
}
