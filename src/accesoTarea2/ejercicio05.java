package accesoTarea2;

import java.io.IOException;
import java.io.File;

public class ejercicio05
{
    public static void main(final String[] args) throws IOException {
        final String home = "C:\\Home";
        final File fichViejo = new File(String.valueOf(home) + "\\d1\\f11.txt");
        final File fichNuevo = new File(String.valueOf(home) + "\\d1\\f12.txt");
        fichViejo.renameTo(fichNuevo);
        final File fichOrigen = new File(String.valueOf(home) + "\\d2\\f21.txt");
        final File fichDestino = new File(String.valueOf(home) + "\\d1\\f21.txt");
        fichOrigen.renameTo(fichDestino);
        final File dir2 = new File(String.valueOf(home) + "\\d2");
        dir2.delete();
    }
}
