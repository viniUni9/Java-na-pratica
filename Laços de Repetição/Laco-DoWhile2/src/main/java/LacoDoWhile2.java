/*
    Faça um programa em linguagem Java que funcione através do 
    menu a seguir:
    1 - Somar vários números
    2 - Multiplicar vários números
    3 - Sair do programa
*/

import java.util.Scanner;
public class LacoDoWhile2 {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        int opc;
        
        float num, soma, prod;
        
        do{
            System.out.println("1- Somar vários números:");
            
            System.out.println("2- Multiplicar vários números:");
            
            System.out.println("3- Sair:");
            
            opc = leitorScanner.nextInt();
            
            if (opc == 1){
                soma = 0;
                
                System.out.println("Digite um número ou -999 para encerar:");
                
                num = leitorScanner.nextFloat();
                
            while(num != -999){
            soma += num;
            
            System.out.println("Digite um número ou -999 para encerar:");
            
            num = leitorScanner.nextFloat();
            }
            System.out.println("Soma é igual:"+ soma);
        }
            else if (opc == 2){
                prod = 1;
                
                System.out.println("Digite um número ou -999 para encerar:");
                
                 num = leitorScanner.nextFloat();
                 
            while (num != -999){
                prod *= num;
                
                System.out.println("Digite um número ou -999 para encerar:");
                
                num = leitorScanner.nextFloat();
            }
                System.out.println("Multiplicação é igual:"+ prod);
            }
    }while (opc != 3);
        System.out.println("Programa finalizado:");
}
}