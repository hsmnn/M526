package ch.epai.ict.m526.serie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("source.txt"));

        String line = reader.readLine();
        int i = 1;
        while (line != null) {
            if (line.startsWith("if") || (line.startsWith("while"))) {
                if (line.contains(" = ")) {
                    System.out.println("Il y a une erreur à la ligne " + i + " de votre code : ");
                    System.out.println(line);
                }
            }
            line = reader.readLine();
            i += 1;
        }
        reader.close();
    }
}
