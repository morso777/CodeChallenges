package org.example;

public class PiramidNumbersInverted {


    public static void main(String[] args) {
        int n = 5; // Tamaño de la pirámide
        int maxNum = 2 * n - 1; // Cantidad máxima de números en la primera fila

        for (int i = 0; i < n; i++) { // Controla el número de líneas
            // Imprimir espacios iniciales para la alineación
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Imprimir los números de 1 hasta la cantidad adecuada
            for (int j = 1; j <= maxNum - (2 * i); j++) {
                System.out.print(j);
            }

            System.out.println(); // Salto de línea
        }
    }
}

