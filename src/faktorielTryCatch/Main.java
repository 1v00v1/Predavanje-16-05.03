package faktorielTryCatch;

import java.util.Scanner;


//TODO Napiši Java program koji omogućuje korisniku unos broja, a zatim računa faktorijel tog broja.
// Program treba obraditi iznimke koje se mogu pojaviti tijekom unosa i računanja faktorijela.
// Ispiši poruku korisniku da unese broj.
// Koristi Scanner za unos broja od korisnika.
// Obradi iznimke koje se mogu pojaviti tijekom unosa. Ako korisnik unese nešto što nije broj,
// ispiši odgovarajuću poruku i zatraži ponovni unos.
// Računaj faktorijel unesenog broja.Obradi iznimke koje se mogu pojaviti tijekom računanja faktorijela.
// Na primjer, obradi situaciju kada korisnik unese negativan broj jer faktorijel nije definiran za negativne brojeve.
// Ispiši rezultat ili poruku o greški, ovisno o tome je li računanje faktorijela uspješno ili ne.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Faktoriel.izračunajFaktoriel(s);
        s.close();
    }
}






