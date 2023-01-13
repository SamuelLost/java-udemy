import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Implementação com interface funcional
        // list.removeIf(new ProductPredicate());

        // Implementação com método estático (referência de método)
        // list.removeIf(Product::staticProductPredicate);

        // Implementação com método não estático (referência de método)
        // list.removeIf(Product::nonStaticProductPredicate);

        // Implementação com expressão lambda declarada
        // Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        // list.removeIf(pred);

        // Implementação com expressão lambda inline
        list.removeIf(p -> p.getPrice() >= 100.0);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
