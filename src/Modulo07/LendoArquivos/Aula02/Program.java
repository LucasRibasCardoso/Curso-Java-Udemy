package Modulo07.LendoArquivos.Aula02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Users\\lucas\\OneDrive\\Documentos\\GitHub\\CursoJavaNelioAlves\\src\\Modulo07\\LendoArquivos\\Aula02\\in.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            }
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
