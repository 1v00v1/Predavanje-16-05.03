package faktorielTryCatch;

import java.util.Scanner;

public class Faktoriel {

    static void  izračunajFaktoriel(Scanner s) throws Exception {
        boolean exit = false;
        int a;
        do {
            try {
                System.out.println("Unesite broj za provjeru faktorijela: ");
                a = Integer.parseInt(s.nextLine());
                if (a <= 0 || a > Integer.MAX_VALUE) {
                    System.out.println("Unesite validan broj između 0 i " + Integer.MAX_VALUE);

                } else {

                    int temp = 1;
                    for (int i = 1; i <= a; i++) {
                        temp *= i;
                    }
                    System.out.println("Faktorijel broja " + a + " je: " + temp);
                    exit = true;
                }
            } catch (NumberFormatException e) {
                System.out.println( "Unešeno nije broj");
                e.getMessage();

            }

        } while (!exit);


    }
}
