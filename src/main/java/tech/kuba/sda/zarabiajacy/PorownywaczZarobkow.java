package tech.kuba.sda.zarabiajacy;

import java.util.Comparator;

public class PorownywaczZarobkow<T extends Zarabiajacy> implements Comparator<T> {
    @Override
    public int compare(T t, T t1) {
        double z1 = t.getRoczneWynagrodzenie();
        double z2 = t1.getRoczneWynagrodzenie();
        if(z1 < z2) {
            return -1;
        } else if (z1 > z2) {
            return 1;
        } else {
            return 0;
        }
    }
}
