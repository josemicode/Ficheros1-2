package accesoTarea2;

import java.io.File;

public class ejercicio03
{
    public static void main(final String[] args) {
        final String ruta = "C:\\TEMA1";
        listar(ruta);
    }
    
    private static void listar(final String dir) {
        final File[] listadoArchivos = new File(dir).listFiles();
        File[] array;
        for (int length = (array = listadoArchivos).length, i = 0; i < length; ++i) {
            final File ele = array[i];
            if (ele.isDirectory()) {
                System.out.println(String.valueOf(ele.getName()) + " [Folder]");
                listar(ele.getPath());
            }
            else {
                final int LIO = ele.toString().lastIndexOf(46);
                final int numChars = ele.toString().length();
                final String ext = ele.toString().substring(LIO + 1, numChars);
                System.out.println(String.valueOf(ele.getName()) + " (Tipo: " + ext + ")");
            }
        }
    }
}