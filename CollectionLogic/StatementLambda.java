package CollectionLogic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StatementLambda {

    class Product {
        Long id;
        String name;
        int price;

        // Contructor Class Product
        Product(Long id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        Long getId() {
            return id;
        }

        String getName() {
            return name;
        }

        int getPrice() {
            return price;
        }
    }

    List<Product> products = Arrays.asList(
            new Product(1L, "Baju 01", 9500),
            new Product(2L, "Baju 02", 10000),
            new Product(3L, "Kameja", 15000),
            new Product(4L, "Tas", 20000));

    public static void main(String[] args) {

        // installasi
        StatementLambda obj = new StatementLambda();

        // get value text Name First 'B' with lambda
        // #Selection use function filter and use IF
        obj.products.stream()
                .filter(p -> p.getName().startsWith("B") && p.getPrice() < 10000)
                // .forEach(System.out::println); Not message
                .forEach(p -> System.out.println("Result use function 'FILTER' :: " + p.getName()));

        // #Selection use function filter n Map[String]
        List<String> result = obj.products.stream()
                .filter(a -> a.getName().startsWith("B"))
                .map(a -> a.getName())
                .collect(Collectors.toList());
        System.out.println("Add to list use function 'FILTER' :: " + result);

        // #get value filter to space text 'B'
        List<Product> rsl = obj.products.stream()
                .filter(s -> s.getName().startsWith("B") && s.getPrice() < 10000)
                .collect(Collectors.toList());
        Map<Long, Product> map = rsl.stream()
                .collect(Collectors.toMap(Product::getId, p -> p));

        map.forEach((key, value) -> {
            System.out.println("ID : " + key + " Description : " + value.getName());
        });

    }

}
