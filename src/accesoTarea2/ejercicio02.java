package accesoTarea2;

import java.io.IOException;
import java.io.File;

public class ejercicio02
{
    public static void main(final String[] args) throws IOException {
        final File dir = new File("C:\\TEMA1");
        dir.mkdir();
        System.out.println("La ruta del archivo es: " + dir.getCanonicalPath());
    }
}