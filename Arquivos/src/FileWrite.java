import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "out.txt";

        // Cria/Recria o arquivo: new FileWriter(path)
        // Adiciona conteúdo ao arquivo: new FileWriter(path, true)
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))  {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}