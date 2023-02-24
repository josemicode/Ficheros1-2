package accesoTarea3;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;

public class ejercicio06
{
    public static void main(final String[] args) throws IOException {
        final File fichero = new File("./src/fichero3.txt");
        final FileReader fr = new FileReader(fichero);
        final Scanner sc = new Scanner(System.in);
        int data = fr.read();
        char aux = (char)data;
        while (data != -1) {
            for (int j = 0; j < 23; ++j) {
                for (int i = 0; i < 80 && data != -1; data = fr.read(), aux = (char)data, ++i) {
                    System.out.print(aux);
                }
                if (data == -1) {
                    break;
                }
                System.out.println();
            }
            System.out.println("\n\nPresiona cualquier tecla para continuar\n\n");
            sc.next();
        }
    }
}