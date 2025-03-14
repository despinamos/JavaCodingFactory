package gr.aueb.cf.exercises2025.javabuiltininterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List <Product> products = new ArrayList<>();

        Product product1 = new Product(3L, "Oranges", 6, 10);
        Product product2 = new Product(4L, "Apples", 6, 10);
        Product product3 = new Product(5L, "Tangerines", 6, 10);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        List<Product> filteredProducts = getFilteredProducts(products, new IProductFilter() {
            @Override
            public boolean filterProduct(Product product) {
                return product.getId() == 3L;
            }
        });

        for (Product product : filteredProducts) {
            product.printInstanceProduct();
        }

        // Lambda expression

        List<Product> filteredProducts2 = getFilteredProducts(products, product -> product.getId() == 3);

        for (Product product : filteredProducts2) {
            product.printInstanceProduct();
        }

        // Interface Predicate for filter
        // Interface Consumer to print List elements

        List<Product> filteredProducts3 = getFilteredProductsWithPredicate(products, product -> product.getId() == 3);
        printProducts(filteredProducts3, product -> Product.printStaticProduct(product));

        // print with method reference
        printProducts(filteredProducts3, Product::printInstanceProduct);

        // print with forEach

       filteredProducts3.forEach(Product::printInstanceProduct);
    }

    public static List<Product> getFilteredProducts(List<Product> products,
                                                    IProductFilter filter) {
        List<Product> productsToReturn = new ArrayList<>();

        for(Product product : products) {
            if(filter.filterProduct(product)) {
                productsToReturn.add(product);
            }
        }

        return productsToReturn;
    }

    public static List<Product> getFilteredProductsWithPredicate(List<Product> products, Predicate<Product> filter) {
        List<Product> productsToReturn = new ArrayList<>();

        for(Product product : products) {
            if(filter.test(product)) {
                productsToReturn.add(product);
            }
        }

        return productsToReturn;
    }

    public static void printProducts(List<Product> products, Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }
}
