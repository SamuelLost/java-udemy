import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        //Atualizar o preço de todos os produtos em 10%
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        
        // Implementação da interface Function
        // converteparastream.aplicaafunçãoemcadaelemento.econverteparalista
        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // Reference method com método estático
        // List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // Reference method com método não estático
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // Expressão lambda declarada
        // Function<Product, String> func = p -> p.getName().toUpperCase();
        // List<String> names = list.stream().map(func).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // Expressão lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);

        // list.forEach(System.out::println);
    }
}
