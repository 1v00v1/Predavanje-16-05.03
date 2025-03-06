package streams;

import java.io.*;

public class FileWriterString {
    public static void main(String[] args)  {
        try (
                Reader ulaz = new StringReader("Dolazi nam pauza");
             Writer izlaz = new FileWriter("Pauza.txt")
             ){
            int c;
            while ((c = ulaz.read()) !=-1){
                izlaz.write(Character.toUpperCase((char) c));
                izlaz.write('\n');
                izlaz.write(' ');

            }

        } catch (IOException e) {
            System.out.println("Dogodio se error");
        }


    }
}
