package tech.kuba.sda.firma;

import java.util.List;

public class Firma {
    private String nazwaFirmy;
    private String szef;
    private List<Pracownik> listPracownikow;

    public Firma(String nazwaFirmy, String szef, List<Pracownik> listPracownikow) {
        this.nazwaFirmy = nazwaFirmy;
        this.szef = szef;
        this.listPracownikow = listPracownikow;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public String getSzef() {
        return szef;
    }

    public List<Pracownik> getListPracownikow() {
        return listPracownikow;
    }

//    @Override
//    public String toString() {
//        return "Firma: " + "<" + nazwaFirmy + ">\n"  +
//                "Szef: " + "<" + szef + ">\n" +
//                "Pracownicy:" + listPracownikow +
//                '}';
//    }
}
