package accesoTarea3;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class ejercicio03
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
        final StringTokenizer st = new StringTokenizer(cadena);
        String iniciales = "";
        String aux2 = " ";
        while (st.hasMoreTokens()) {
            if (aux2.equals(" ")) {
                iniciales = String.valueOf(iniciales) + st.nextToken(" ").charAt(0) + " ";
            }
            else {
                aux2 = st.nextToken();
            }
        }
        System.out.println("Aqu\u00ed est\u00e1n las iniciales de cada palabra del fichero: \n" + iniciales);
    }
}