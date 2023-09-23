import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Csvreader {
    public static void main(String[] args) {
        String path = "C:\\Users\\gsoto\\OneDrive\\Documents\\UVG\\Sm 2\\POO\\Laboratorio 2\\sede.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // Cierra el archivo después de leerlo.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
