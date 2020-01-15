package tech.kuba.sda.other;

public class MonthsFromBirth {
    public static void main(String[] args) {

        Date birthDate = new Date(10,7,1983);
        int presentDate = birthDate.monthsFromBirth(2019, 11);
        System.out.println("minely " + presentDate + " miesiace");

//        int d = monthsFromBirth(2019, 11, 1983, 7);
//        System.out.println(d);
    }

//    public static int monthsFromBirth(int thisYear, int thisMonth, int birthYear, int birthMonth) {
//        return ((thisYear - birthYear) * getMonthsInYear()) + thisMonth - birthMonth;
//    }

//    public static int getMonthsInYear() {
//        return 12;
//    }
}
