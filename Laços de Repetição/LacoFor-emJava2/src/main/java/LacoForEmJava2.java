/*Faça um programa em Java que leia N valores e ao final imprima a 
média aritmética dos valores lidos.
 O programa deve perguntar ao usuário quantos valores devem ser lidos!
*/

import java.util.Scanner;
public class LacoForEmJava2 {

    public static void main(String[] args) {
        float num, soma = 0, media = 0;
        
        int qtdValores;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Quantos valores devo ler ? ");
        
        qtdValores = leitorScanner.nextInt();
        
        for(int i = 1; i <= qtdValores; i++){
            System.out.println("Informe o número: " + i);
            
            num = leitorScanner.nextFloat();
            
            soma += num;
        }
        media = soma / qtdValores;
        
        System.out.println("A média é: " + media);
    }
}
