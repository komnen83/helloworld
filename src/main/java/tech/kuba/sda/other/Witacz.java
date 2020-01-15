package tech.kuba.sda.other;

public class Witacz {

    public static void main(String[] args) {
        welcome("German");
        welcome("POLISH");
        welcome("RUSSIAN");

        nazwaDnia(3);

    }

    private static void welcome(String country) {
        switch (country) {
            case "POLISH":
                System.out.println("Czesc, siema!");
                break;
            case "GERMAN":
                System.out.println("HALLO!");
                break;
            case "ENGLISH":
                System.out.println("Hi!");
                break;
            case "FRENCH":
                System.out.println("Bonjour!");
                break;
            default:
                System.out.println("Sorry i don't szprecham your langłedż");
        }
    }

    public static String nazwaDnia(int i) {
        switch (i) {
            case 1:
                System.out.println("poniedziałek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
        }
        return null;
    }
}
