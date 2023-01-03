import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        String pathStr = "/home/samuel/Udemy/java-udemy/Arquivos";
        String pathIn = "products.csv";
        String pathOut = "out/summary.csv";
        File path = new File(pathStr);
        boolean success = new File(pathStr+"//out").mkdir();
        System.out.println("Directory created successfully: " + success);
        try(BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
                String line = br.readLine();
                while (line != null) {
                    String[] fields = line.split(",");
                    String name = fields[0];
                    double price = Double.parseDouble(fields[1]);
                    int quantity = Integer.parseInt(fields[2]);
                    double total = price * quantity;
                    bw.write(name + "," + String.format("%.2f", total));
                    bw.newLine();
                    line = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }                                                                                                              
    }
}
