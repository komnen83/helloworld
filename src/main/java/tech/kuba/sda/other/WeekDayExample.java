package tech.kuba.sda.other;

import java.util.Arrays;

public class WeekDayExample {

    public static void main(String[] args) {
        WeekDay currentWeekDay = getCurrentWeekDay();
        System.out.println(currentWeekDay.ordinal());
        System.out.println(currentWeekDay.name());

        WeekDay wednesday = WeekDay.valueOf("WEDNESDAY");
        System.out.println(wednesday.ordinal());
        System.out.println(wednesday.name());
        WeekDay[] values = WeekDay.values();
        System.out.println(Arrays.toString(values));

    }

    private static WeekDay getCurrentWeekDay() {
        return WeekDay.SUNDAY;
    }
}
