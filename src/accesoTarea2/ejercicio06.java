package accesoTarea2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.File;

public class ejercicio06
{
    public static void main(final String[] args) throws IOException {
        final String ruta = "C:\\TEMA1";
        final String nombreArchivo = "ejemplo.txt";
        new File(String.valueOf(ruta) + "\\" + nombreArchivo).createNewFile();
        fileInfo(String.valueOf(ruta) + "\\" + nombreArchivo);
    }
    
    private static void fileInfo(final String path) {
        final File arc = new File(path);
        System.out.println("Nombre: " + arc.getName());
        System.out.println("Ruta Absoluta: " + arc.getAbsolutePath());
        System.out.println("El n\u00famero de bytes es: " + arc.length());
        if (arc.isDirectory()) {
            System.out.println("El archivo es un directorio");
        }
        else {
            System.out.println("El archivo NO es un directorio");
        }
        final DateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy hh:mm a");
        System.out.println("La fecha de \u00faltima modificaci\u00f3n es: " + sdf.format(arc.lastModified()));
        if (arc.canRead()) {
            System.out.println("El archivo tiene permisos de lectura");
        }
        else {
            System.out.println("El archivo NO tiene permisos de lectura");
        }
        if (arc.canWrite()) {
            System.out.println("El archivo tiene permisos de escritura");
        }
        else {
            System.out.println("El archivo NO tiene permisos de escritura");
        }
        if (arc.canExecute()) {
            System.out.println("El archivo tiene permisos de ejecuci\u00f3n");
        }
        else {
            System.out.println("El archivo NO tiene permisos de ejecuci\u00f3n");
        }
    }
}