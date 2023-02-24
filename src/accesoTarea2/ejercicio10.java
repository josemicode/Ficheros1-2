package accesoTarea2;

import java.io.File;

public class ejercicio10
{
    public static void main(final String[] args) {
        final File directorio = new File("C:\\Home");
        listar(directorio);
    }
    
    private static void listar(final File dir) {
        final File[] listadoArchivos = dir.listFiles();
        if (listadoArchivos.length == 0) {
            System.out.println("Directorio Vac\u00edo");
        }
        File[] array;
        for (int length = (array = listadoArchivos).length, i = 0; i < length; ++i) {
            final File ele = array[i];
            if (ele.isDirectory()) {
                System.out.println(String.valueOf(ele.getName()) + " (Tipo: Directorio)");
                listar(ele);
            }
            else {
                final int LIO = ele.toString().lastIndexOf(46);
                final int numChars = ele.toString().length();
                String ext = ele.toString().substring(LIO + 1, numChars);
                if (LIO == -1) {
                    ext = "Archivo";
                }
                System.out.println(String.valueOf(ele.getName()) + " (Tipo: " + ext + ")");
            }
        }
    }
}