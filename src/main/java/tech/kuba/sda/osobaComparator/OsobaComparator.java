package tech.kuba.sda.osobaComparator;

import java.util.Comparator;

public class OsobaComparator implements Comparator<Osoba> {
    @Override
    public int compare(Osoba osoba1, Osoba osoba2) {
        int i = osoba1.getNazwisko().compareTo(osoba2.getNazwisko());
        if (i > 0) {
            return 1;
        } else if (i < 0) {
            return -1;
        } else if (i == 0) {
            return osoba1.getImie().compareTo(osoba2.getImie());
        }
        return i;
    }
}
