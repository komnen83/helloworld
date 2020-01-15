package tech.kuba.sda.other;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int monthsFromBirth(int y, int m) {
        int x = ((y - year) * 12) + m - month;
        if (x > 100) {
            System.out.println("Mineło 100 miesiecy!");
        } else {
            System.out.println("Nie minelo 100 miesiecy");
        }
        return x;
    }

//    String dayOfWeek = "poniedziałek";
//
//    switch(dayOfWeek) {
//        case "poniedziałek":
//            System.out.println("1");
//            break;
//        case "wtorek":
//            System.out.println("2");
//            break;
//        case "sroda":
//            System.out.println("3");
//            break;
//    }

}
