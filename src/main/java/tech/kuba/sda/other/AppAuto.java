package tech.kuba.sda.other;

public class AppAuto {
    public static void main(String[] args) {
        Auto ford = new Auto("Ford", "Focus","szary",2015,7);
        Auto renault = new Auto("Renault", "Thalia","zielony",2004,8);

        System.out.println(ford.getSpecyfikacja() + "\n");
        System.out.println(renault.getSpecyfikacja());
    }

}
