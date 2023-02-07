/*
sintaxe do while em Java:
    while(condição de incremento ou parada) {
        //será executado N vezes
    }
    Faça um programa em Java que realize a soma de 
    todos os valores inteiros de 1 a n, sendo 
    que n deve ser informado pelo usuário,
    usando while.
*/

import java.util.Scanner;
public class LacoWhile {

    public static void main(String[] args) {
        int i = 1, soma = 0, n;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Informe quantos valores devem ser somados: ");
        
        n = leitorScanner.nextInt();
        
        while(i <= n) { 
        soma += i; //soma = soma + i
        i++;
    }
        System.out.println("A soma dos valores é: " + soma);
    }
}