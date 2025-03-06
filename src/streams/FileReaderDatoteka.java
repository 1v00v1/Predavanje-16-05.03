package streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDatoteka {
    public static void main(String[] args) {
        File inputFile = new File("Datoteka1.txt");
        File outputFile = new File("Kopija.txt");

        try (FileReader ulaz = new FileReader(inputFile); FileWriter izlaz = new FileWriter(outputFile)) {

            int c;
            while ((c = ulaz.read()) != -1) {
                izlaz.write(c);

            }
        } catch (IOException e) {
            System.err.println("Greška " + e.getMessage());
        }
    }
}
