package org.example;

public class PiramidNumbers {

    /*Print the below piramid with numbers

    1
   123
  12345
 1234567
1234567890

    */

    public static void main(String[] args) {
        int n = 5; // Número de niveles de la pirámide
        int maxNum = 2 * n; // Cantidad máxima de números en la última fila

        for (int i = 1; i <= n; i++) { // Controla el número de líneas
            // Imprimir espacios iniciales para la alineación
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            // Imprimir los números de 1 hasta la cantidad adecuada
            for (int j = 1; j <= 2 * i-1; j++) {
                System.out.print(j % 10); // Usamos % 10 para asegurarnos de que 10 se imprima como 0
            }

            System.out.println(); // Salto de línea
        }
    }


}
