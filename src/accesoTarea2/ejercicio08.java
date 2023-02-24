package accesoTarea2;

import java.io.IOException;
import java.io.File;

public class ejercicio08
{
    public static void main(final String[] args) throws IOException {
        final File home = new File("C:\\Home");
        home.mkdir();
        final File usr1 = new File(String.valueOf(home.getPath()) + "\\usr1");
        usr1.mkdir();
        final File f1 = new File(String.valueOf(usr1.getPath()) + "\\f1");
        f1.createNewFile();
        final File usr2 = new File(String.valueOf(home.getPath()) + "\\usr2");
        usr2.mkdir();
        final File d1 = new File(String.valueOf(usr2.getPath()) + "\\d1");
        d1.mkdir();
        final File f2 = new File(String.valueOf(d1.getPath()) + "\\f2");
        f2.createNewFile();
        final File d2 = new File(String.valueOf(usr2.getPath()) + "\\d2");
        d2.mkdir();
        final File f3 = new File(String.valueOf(d2.getPath()) + "\\f3");
        f3.createNewFile();
        final File f4 = new File(String.valueOf(d2.getPath()) + "\\f4");
        f4.createNewFile();
        final File d3 = new File(String.valueOf(d2.getPath()) + "\\d3");
        d3.mkdir();
    }
}