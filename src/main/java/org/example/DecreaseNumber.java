package org.example;

public class DecreaseNumber {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // Controla el número de líneas (de 5 a 1)
            for (int j = 1; j <= i; j++) { // Imprime los números de 1 hasta i
                System.out.print(j);
            }
            System.out.println(); // Salto de línea
        }
    }

}
