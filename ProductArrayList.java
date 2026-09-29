package OExercise7;

import java.util.ArrayList;

public class ProductArrayList {

    ArrayList<Product> products = new ArrayList<>();

    public void addProductToArrayList(Product product) {
        products.add(product);
    }

    public void updateProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.updateProduct();
                return;
            }
        }
        System.out.println("Not found massage!");
    }

    public void deleteProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
                return;
            }
        }
        System.out.println("Not found massage!");
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayDetails();
        }
    }

    void displayAvailableProducts() {
        for (Product product : products) {
            if (product.isIsAvailable() == true) {
                product.displayDetails();
            }
        }
    }

    public double findHighestPrice() {
        double max = 0;
        for (Product product : products) {
            if (product.calculatePrice() > max) {
                max = product.calculatePrice();
            }
        }
        return max;
    }
}
