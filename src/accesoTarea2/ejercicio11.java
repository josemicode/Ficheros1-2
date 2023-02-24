// 
// Decompiled by Procyon v0.5.36
// 

package accesoTarea2;

import java.util.Scanner;
import java.io.File;

public class ejercicio11
{
    public static void main(final String[] args) {
        final File directorio = new File("C:\\Home");
        cortarArbol(directorio);
    }
    
    private static void cortarArbol(final File dir) {
        final File[] listadoArchivos = dir.listFiles();
        final Scanner sc = new Scanner(System.in);
        File[] array;
        for (int length = (array = listadoArchivos).length, i = 0; i < length; ++i) {
            final File ele = array[i];
            if (ele.isDirectory()) {
                cortarArbol(ele);
            }
            System.out.println("¿Eliminar " + ele.getName() + "? [Introduzca NO para cancelar]");
            final String cond = sc.next();
            if (cond.equalsIgnoreCase("no")) {
                break;
            }
            ele.delete();
        }
    }
}
