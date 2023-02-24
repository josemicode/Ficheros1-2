package accesoTarea3;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

public class ejercicio05
{
    public static void main(final String[] args) throws IOException {
        final File tema2 = new File("C:\\TEMA2");
        tema2.mkdir();
        final String arg1 = "lorem.txt";
        final String arg2 = "fichero2.txt";
        final File ficheroOrigen = new File(String.valueOf(tema2.getPath()) + "\\" + arg1);
        ficheroOrigen.createNewFile();
        final File ficheroDestino = new File(String.valueOf(tema2.getPath()) + "\\" + arg2);
        ficheroDestino.createNewFile();
        final FileReader fr = new FileReader(ficheroOrigen);
        final FileWriter fw = new FileWriter(ficheroDestino);
        for (int data = fr.read(); data != -1; data = fr.read()) {
            fw.write(data);
        }
        fw.close();
        System.out.println("El fichero ha sido copiado exitosamente");
    }
}