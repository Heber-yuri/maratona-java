package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula10While {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        System.out.println("Digite um numero: ");
        numero = digite.nextInt();
        while (contador <= numero) {
            System.out.println("Contador: " + contador);
            contador = contador + 2;
        }
    }
    }