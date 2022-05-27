package Core.Java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamNewEx {
    public static void main(String[] args) {
        List<Product> catalog = getCatalog();
        /*method MAP using for change type (ex. From Stream to String). Use as parameter Functional int. */
        Stream<Integer> streamMapPrice = catalog.stream().map(Product::getPrice);
        /*method FILTER using for check expression matches filter parameter (true or false). Use as parameter Predicate int. */
//        Stream<Integer> productStream = catalog.stream().map(Product::getPrice).filter(price -> price > 20000);
        Stream<Product> productStream2 = catalog.stream().filter(product -> product.getPrice().equals(21000) );

        streamMapPrice.forEach(System.out::println);
        System.out.println();
        productStream2.forEach(System.out::println);
        System.out.println();
        /*method SORTED using for sort filtered values by Comparator Int. with method compare */
        catalog.stream().filter(p -> p.getPrice() < 20000).sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);
        /*Thermal method COLLECT using for build elements to collection with static methods of class CollectorS, or Collector */
        List<Product> collect = catalog.stream().filter(p -> p.getPrice() < 20000).sorted(Comparator.comparing(Product::getPrice)).collect(toList());
        System.out.println();
        Long product = collect.stream().filter(product1 -> product1.getCode() == 0).count();
        System.out.println(product);
    }

    public static List<Product> getCatalog(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("OnePLus 9R", 15500, 101, "high price"));
        products.add(new Product("OnePLus 10R", 17500, 211, "more best camera"));
        products.add(new Product("Xiaomi 10t", 16500, 0, "lover price"));
        products.add(new Product("Xiaomi 10 Pro", 26500, 215, "Camera, Supercharge, high price"));
        products.add(new Product("Xiaomi 10", 21000, 102, ""));
        products.add(new Product("Samsung 22", 0, 0, ""));
        products.add(new Product("Samsung 22 Ultra", 0, 210, "Will be"));

        return products;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product {
    private String name;
    private Integer price;
    private Integer code;
    private String description;

}
