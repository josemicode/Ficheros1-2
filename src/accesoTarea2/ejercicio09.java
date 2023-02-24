package accesoTarea2;

import java.io.File;

public class ejercicio09
{
    public static void main(final String[] args) {
        final String ruta = "C:\\TEMA1";
        final File directorio = new File(ruta);
        listar(directorio);
    }
    
    private static void listar(final File dir) {
        final File[] listadoArchivos = dir.listFiles();
        File[] array;
        for (int length = (array = listadoArchivos).length, i = 0; i < length; ++i) {
            final File ele = array[i];
            if (ele.isDirectory()) {
                System.out.println(String.valueOf(ele.getName()) + " (Tipo: Directorio)");
            }
            else {
                System.out.println(String.valueOf(ele.getName()) + " (Tipo: Fichero, Tama\u00f1o: " + ele.length() + " bytes)");
            }
        }
    }
}