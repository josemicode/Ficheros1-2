package accesoTarea2;

import java.io.File;

public class ejercicio01
{
    public static void main(final String[] args) {
        final String ruta = "C:\\Windows";
        final File dir1 = new File(ruta);
        final File[] fileList = dir1.listFiles();
        File[] array;
        for (int length = (array = fileList).length, i = 0; i < length; ++i) {
            final File ele = array[i];
            System.out.println(ele.getName());
        }
    }
}