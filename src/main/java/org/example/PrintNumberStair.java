package org.example;

public class PrintNumberStair {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Controla el número de líneas
            for (int j = 1; j <= i; j++) { // Imprime los números en cada línea
                System.out.print(j);
            }
            System.out.println(); // Salto de línea
        }
    }
}
