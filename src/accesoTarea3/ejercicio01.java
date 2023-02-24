package accesoTarea3;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class ejercicio01
{
    public static void main(final String[] args) throws IOException {
        final File tema2 = new File("C:\\TEMA2");
        tema2.mkdir();
        final File fichero = new File(String.valueOf(tema2.getPath()) + "\\lorem.txt");
        fichero.createNewFile();
        final String texto = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\net dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation hue ullamco laboris nisi ut\naliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in chinchong voluptate velit esse\ncillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa\nqui officia deserunt ahorium ehemonioho mollit anim id est laborum.";
        final FileWriter fw = new FileWriter(fichero);
        fw.write(texto);
        fw.close();
        final FileReader fr = new FileReader(fichero);
        int data = fr.read();
        final int[] charArray = new int[5];
        while (data != -1) {
            if (String.valueOf((char)data).equalsIgnoreCase("A")) {
                final int[] array = charArray;
                final int n = 0;
                ++array[n];
            }
            else if (String.valueOf((char)data).equalsIgnoreCase("E")) {
                final int[] array2 = charArray;
                final int n2 = 1;
                ++array2[n2];
            }
            else if (String.valueOf((char)data).equalsIgnoreCase("I")) {
                final int[] array3 = charArray;
                final int n3 = 2;
                ++array3[n3];
            }
            else if (String.valueOf((char)data).equalsIgnoreCase("O")) {
                final int[] array4 = charArray;
                final int n4 = 3;
                ++array4[n4];
            }
            else if (String.valueOf((char)data).equalsIgnoreCase("U")) {
                final int[] array5 = charArray;
                final int n5 = 4;
                ++array5[n5];
            }
            data = fr.read();
        }
        System.out.println("[Cantidad de cada vocal]\nA: " + charArray[0] + "\n" + "E: " + charArray[1] + "\n" + "I: " + charArray[2] + "\n" + "O: " + charArray[3] + "\n" + "U: " + charArray[4]);
    }
}