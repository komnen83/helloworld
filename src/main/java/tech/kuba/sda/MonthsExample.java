package tech.kuba.sda;

import java.util.Arrays;

public class MonthsExample {

    public static void main(String[] args) {
        Months currentMonth = getCurrentMonth();
        System.out.println(currentMonth.ordinal());
        System.out.println(currentMonth.name());

        Months october = Months.valueOf("OCTOBER");
        System.out.println(october.ordinal());
        System.out.println(october.name());

        Months[] values = Months.values();
        System.out.println(Arrays.toString(values));

    }

    private static Months getCurrentMonth() {
        return Months.NOVEMBER;
    }
}
