package accesoTarea3;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class ejercicio02
{
    public static void main(final String[] args) throws IOException {
        final File fichero = new File("C:\\TEMA2\\lorem.txt");
        fichero.createNewFile();
        final FileReader fr = new FileReader(fichero);
        final BufferedReader br = new BufferedReader(fr);
        String aux = "";
        String cadena = "";
        while ((aux = br.readLine()) != null) {
            cadena = String.valueOf(cadena) + aux;
        }
        final StringTokenizer st = new StringTokenizer(cadena, " ");
        int counter = 0;
        while (st.hasMoreTokens()) {
            ++counter;
            st.nextToken();
        }
        System.out.println("El n\u00famero de palabras en el archivo es: " + counter);
    }
}