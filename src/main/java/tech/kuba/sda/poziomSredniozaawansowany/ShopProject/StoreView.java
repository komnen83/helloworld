package tech.kuba.sda.poziomSredniozaawansowany.ShopProject;

public class StoreView {

    private Store store;

    public StoreView(Store store) {
        this.store = store;
    }

    public void printProductList(Product product) {

        System.out.println(String.format("%s %20s %10s %7s %2s %7s %2s %7s %2s %7s %2s", "|",
                product.getProductName(), "|",
                product.getProductQuantity(), "|",
                product.isItOnPromotion(), "|",
                product.getVatRate(), "|",
                product.getPrice(), "|"));
    }
}
