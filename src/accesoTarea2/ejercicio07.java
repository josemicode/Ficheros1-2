package accesoTarea2;

import java.io.File;

public class ejercicio07
{
    public static void main(final String[] args) {
        final String ruta = "C:\\TEMA1";
        final String nombreArchivo = "ejemplo.txt";
        final File archivo = new File(String.valueOf(ruta) + "\\" + nombreArchivo);
        quitarPermisos(archivo);
    }
    
    private static void quitarPermisos(final File ar) {
        if (ar.canExecute()) {
            System.out.println("Este archivo tiene permisos de ejecuci\u00f3n, procediendo a retirarlos");
            ar.setExecutable(false);
        }
        else {
            System.out.println("Este archivo NO tiene permisos de ejecuci\u00f3n");
        }
        if (ar.canRead()) {
            System.out.println("Este archivo tiene permisos de lectura, procediendo a retirarlos");
            ar.setReadable(false);
        }
        else {
            System.out.println("Este archivo NO tiene permisos de lectura");
        }
    }
}