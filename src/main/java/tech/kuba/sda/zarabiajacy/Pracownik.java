package tech.kuba.sda.zarabiajacy;

import java.util.Objects;

public class Pracownik implements Zarabiajacy {
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private int wynagrodzenieRoczne;

    public Pracownik(String imie, String nazwisko, String stanowisko, int wynagrodzenieRoczne) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wynagrodzenieRoczne = wynagrodzenieRoczne;
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

    public int getWynagrodzenieRoczne() {
        return wynagrodzenieRoczne;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", zarobki=" + wynagrodzenieRoczne +
                '}';
    }

    @Override
    public int getRoczneWynagrodzenie() {
        return wynagrodzenieRoczne;
    }
}
