package tech.kuba.sda.zarabiajacy;

public class Pracownik implements Zarabiajacy {
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private int zarobki;

    public Pracownik(String imie, String nazwisko, String stanowisko, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.zarobki = zarobki;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public int getZarobki() {
        return zarobki;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", zarobki=" + zarobki +
                '}';
    }

    @Override
    public int roczneWynagrodzenie() {
        return zarobki;
    }
}
