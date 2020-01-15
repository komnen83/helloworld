package tech.kuba.sda.other;

public class App {
    public static void main(String[] args) {
        Person joe = getJoe();
        String joeIntro = joe.getIntroduction();
        System.out.println(joeIntro);
        int a = joe.celebrateBirthday();
        System.out.println(a);

        Person frank = getFrank();
        System.out.println(frank.getIntroduction());

        Person jakub = getJakub();
        System.out.println(jakub.getIntroduction());
    }

    public static Person getJoe() {
        return new Person(50, "Joe", "Walsh", "male");
    }

    public static Person getFrank() {
        return new Person(70, "Frank", "Drebin", "male");
    }

    public static Person getJakub() {
        return new Person(30, "Jakub", "Bauman", "male");
    }

}
