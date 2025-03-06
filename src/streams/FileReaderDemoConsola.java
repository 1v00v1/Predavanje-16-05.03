package streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoConsola {
    public static void main(String[] args) throws  IOException{

        File inputFile = new File("Datoteka1.txt");
        File inputFile1 = new File("C:\\Users\\goran\\Documents\\Java-Algebra\\modul-1\\Predavanje-16\\Datoteka2.txt");

        try (FileReader ulaz = new FileReader(inputFile)) {

            int c;
            while ((c = ulaz.read()) != -1) {
                System.out.print((char) c);
                ulaz.close();// zatvaranje toka metodom close

            }
        } catch (IOException e) {
            System.err.println("Greška " + e.getMessage());
        }
    }
}