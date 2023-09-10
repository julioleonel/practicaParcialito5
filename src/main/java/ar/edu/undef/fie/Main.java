package ar.edu.undef.fie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");

        var numero = scanner.nextInt();

        scanner.close(); // Importante cerrar el scanner

        var factorial = 1; //  factorial a 1 como valor base

        for (var i = 2; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}



/*
Calcula el factorial de un número pedido por teclado
 */