package accesoTarea3;

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class ejercicio04
{
    public static void main(final String[] args) throws IOException {
        final File fichero = new File("C:\\TEMA2\\lorem.txt");
        fichero.createNewFile();
        final FileReader fr = new FileReader(fichero);
        final BufferedReader br = new BufferedReader(fr);
        String aux = "";
        String cadena = "";
        while ((aux = br.readLine()) != null) {
            cadena = String.valueOf(cadena) + aux;
        }
        System.out.println("El n\u00famero de palabras con alguna hache intercalada es el siguiente:");
        Hpalabras(cadena);
        System.out.println("\nEl n\u00famero de haches intercaladas es este:");
        Hintercal(cadena);
    }
    
    private static void Hintercal(final String cadena) {
        final StringTokenizer st = new StringTokenizer(cadena);
        final List<String> wordArray = new ArrayList<String>();
        int counter = 0;
        final String aux = "";
        while (st.hasMoreTokens()) {
            wordArray.add(st.nextToken());
        }
        for (int i = 0; i < wordArray.size(); ++i) {
            if (wordArray.get(i).contains("h")) {
                for (int j = 0; j < wordArray.get(i).length(); ++j) {
                    final String word = wordArray.get(i);
                    if (String.valueOf(word.charAt(j)).equalsIgnoreCase("h")) {
                        ++counter;
                    }
                    if (word.length() > 1 && j > 0 && String.valueOf(word.charAt(j - 1)).equalsIgnoreCase("c") && String.valueOf(word.charAt(j)).equalsIgnoreCase("h")) {
                        --counter;
                    }
                }
                if (String.valueOf(wordArray.get(i).charAt(0)).equalsIgnoreCase("h")) {
                    --counter;
                }
            }
        }
        System.out.println(counter);
    }
    
    private static void Hpalabras(final String cadena) {
        final StringTokenizer st = new StringTokenizer(cadena);
        final List<String> wordArray = new ArrayList<String>();
        final String aux = "";
        while (st.hasMoreTokens()) {
            wordArray.add(st.nextToken());
        }
        int hcounter = 0;
        for (int i = 0; i < wordArray.size(); ++i) {
            int counter = 0;
            if (wordArray.get(i).contains("h")) {
                for (int j = 0; j < wordArray.get(i).length(); ++j) {
                    final String word = wordArray.get(i);
                    if (String.valueOf(word.charAt(j)).equalsIgnoreCase("h")) {
                        ++counter;
                    }
                    if (word.length() > 1 && j > 0 && String.valueOf(word.charAt(j - 1)).equalsIgnoreCase("c") && String.valueOf(word.charAt(j)).equalsIgnoreCase("h")) {
                        --counter;
                    }
                }
                if (String.valueOf(wordArray.get(i).charAt(0)).equalsIgnoreCase("h")) {
                    --counter;
                }
                if (counter >= 1) {
                    ++hcounter;
                }
            }
        }
        System.out.println(hcounter);
    }
}