package gr.aueb.cf.exercises2025.javabuiltininterfaces;

import gr.aueb.cf.ch20.lambdas.Teacher;

public class Product {
    private Long id;
    private String title;
    private int price;
    private int quantity;

    public Product() {

    }

    public Product(Long id, String title, int price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "id: " + id + " title: " + title + " price: " + price + " quantity: " + quantity;
    }

    public void printInstanceProduct() {
        System.out.println("id: " + id + " title: " + title + " price: " + price + " quantity: " + quantity);
    }

    public static void printStaticProduct(Product product) {
        System.out.println("id: " + product.getId() + " title: " +
                product.getTitle() + " price: " + product.getPrice() +
                " quantity: " + product.getQuantity());
    }
}
