package Streams;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

public class IsItemExpired {
    public static void main(String[] args) {
        Stream<Product> productStream = Stream.of(
                new Product("Milk", LocalDate.of(2024, Month.JULY, 23)),
                new Product("Milk", LocalDate.of(2022, Month.JULY, 23)),
                new Product("Milk", LocalDate.of(2023, Month.JULY, 23))
        );
        String answer = hasExpiredProduct(productStream) ? "Yes" : "No";
        System.out.println("продукт просрочен: " + answer);
    }

    public static boolean hasExpiredProduct(Stream < Product > productStream) {
        return productStream.anyMatch(product -> product.getExpirationDate().isBefore(LocalDate.now()));

    }
    static class Product {
        String name;
        LocalDate expirationDate;

        public Product(String name, LocalDate expirationDate) {
            this.name = name;
            this.expirationDate = expirationDate;
        }

        public String getName() {
            return name;
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }
    }
}
