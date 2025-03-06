package zadaci;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// TODO reiraj novu datoteku u kojoj se nalazi tekst:
//  Pero;Marica;Ivica;Dodo;Ivana
//  Korištenjem BufferedReadera učitaj podatke iz dateke u novu listu, kreiraj novo polje String[] koje će sadržavati imena.
//  Ispiši imena iz polja
//  Implementiraj try-catch
public class ImenaBufferReader {
    public static void main(String[] args) {
        String text;
        String[] imena;

        try (
                FileReader in = new FileReader("Imena.txt");
                BufferedReader reader = new BufferedReader(in)
        ) {
            text = reader.readLine();
            imena = text.split(";");

            for (String ime : imena) {
                System.out.println(ime);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
