package streams;

import java.io.*;


public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the data");
        String read = reader.readLine();
        System.out.println("You entered: " + read);
    }
}
