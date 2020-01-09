package tech.kuba.sda.klasyGeneryczne;

public class WyciskarniaJablek implements Hortex<Jablko, SokJablkowy> {

    @Override
    public SokJablkowy wyciskaj(Jablko owoc) {
        return new SokJablkowy();
    }
}
