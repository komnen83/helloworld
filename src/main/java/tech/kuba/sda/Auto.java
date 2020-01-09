package tech.kuba.sda;

public class Auto {
    String marka;
    private String model;
    private String kolor;
    private int rokProdukcji;
    private int ilePaliwa;

    public Auto(String marka, String model, String kolor, int rokProdukcji, int ilePaliwa) { //konstruktor
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.ilePaliwa = ilePaliwa;
    }

    public int getIlePaliwa() {
        return ilePaliwa;
    }

    public String getSpecyfikacja() {
        String specyfikacja;
        specyfikacja = "Marka: "
                + marka + " " + model
                + "\nWyprodukowany w:  "
                + rokProdukcji + " roku. "
                + "\nKolor: " + kolor
                + "\nSpalanie: " + ilePaliwa + "l/100km";
        return specyfikacja;
    }
}
