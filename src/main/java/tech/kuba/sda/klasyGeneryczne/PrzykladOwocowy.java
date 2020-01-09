package tech.kuba.sda.klasyGeneryczne;

public class PrzykladOwocowy {

    public static void main(String[] args) {
        ProcesPrzetworczy<Jablko, SokJablkowy> proces = new ProcesPrzetworczy<>(
                new SadJablkowy(),
                new WyciskarniaJablek(),
                new HalinaOdJablek()
        );

        proces.uruchomProces(100);
        System.out.println(proces.sprawdzKase());
    }
}
