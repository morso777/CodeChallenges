package org.example;

public class FindLastOcurrence {

    public static void main(String[] args) {
        String text = "amazonaanazzz";
        char target = 'a';
        int firstIndex = -1;
        int lastIndex = -1;

        // Recorrer la cadena con un ciclo for
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                if (firstIndex == -1) {
                    firstIndex = i; // Guarda la primera aparición
                }
                lastIndex = i; // Actualiza la última aparición
            }
        }

        // Imprimir resultados
        System.out.println("First occurrence of '" + target + "' is at index: " + firstIndex);
        System.out.println("Last occurrence of '" + target + "' is at index: " + lastIndex);
    }
}

