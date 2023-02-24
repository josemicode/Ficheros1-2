package accesoTarea2;

import java.io.IOException;
import java.io.File;

public class ejercicio04
{
    public static void main(final String[] args) throws IOException {
        final File home = new File("C:\\Home");
        home.mkdir();
        for (int i = 1; i <= 2; ++i) {
            final File dir = new File(String.valueOf(home.getPath()) + "\\d" + i);
            dir.mkdir();
            final File fich = new File(String.valueOf(dir.getPath()) + "\\f" + i + "1.txt");
            fich.createNewFile();
        }
    }
}