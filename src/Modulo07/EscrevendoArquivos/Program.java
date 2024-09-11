package Modulo07.EscrevendoArquivos;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\lucas\\OneDrive\\Documentos\\GitHub\\CursoJavaNelioAlves\\src\\Modulo07\\EscrevendoArquivos\\Aula01\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
