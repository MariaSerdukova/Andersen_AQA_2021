package school.lesson4.task3;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private String namePayment;
    List<Product> productList = new ArrayList<>();

    public Payment(String name){
        this.namePayment = name;
    }

    public void showProducts(){
        productList.forEach(System.out::println);
     }

    public String getNamePayment() {
        return namePayment;
    }

    public List<Product> getProductList() {
       return productList;
    }

    public void addProduct(String name, double price) {
        productList.add(new Product(name, price));
    }

    private class Product{
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
        }
    }
}

