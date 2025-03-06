package streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrinterWriterDemo {
    public static void main(String[] args) {
        try(Writer izlaz = new FileWriter("Print.txt");
                 PrintWriter ispis = new PrintWriter(izlaz)) {

            ispis.println(3);
            ispis.println("Dobar dan");
            ispis.println(false);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
