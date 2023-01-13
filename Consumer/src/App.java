import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        //Atualizar o preço de todos os produtos em 10%
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Implementação da interface Consumer
        // list.forEach(new PriceUpdate());

        // Reference method com método estático
        // list.forEach(Product::staticPriceUpdate);

        // Reference method com método não estático
        // list.forEach(Product::nonStaticPriceUpdate);

        // Expressão lambda declarada
        // double factor = 1.1;
        // Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
        // list.forEach(cons);

        // Expressão lambda inline
        double factor = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice() * factor));


        list.forEach(System.out::println);
    }
}
