package tech.kuba.sda.poziomSredniozaawansowany.ShopProject;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList;

    public Store() {
        productList = new ArrayList<>();
    }

    public List<Product> addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> returnProductList() {
        return productList;
    }

    public List<Product> removeProduct(Product product) {
        if(productList.isEmpty()) {
            productList.remove(product);
        }
    }

    public int getProductQuantity(String productName) {
        if (!productList.contains(productName)) {
            return -1;
        } else {
            productList.get(getProductQuantity(productName));
        }
    }
}
