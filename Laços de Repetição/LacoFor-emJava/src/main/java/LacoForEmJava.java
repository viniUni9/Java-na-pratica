   /*
        Os laços "for" em portugês estruturado seriam assim (exemplo):
            para i de 1 até 10, faça...
                bloco que será repetido 10x
            fim para;
        
        for (inicialização ; condição de parada; condição de incremento)
        Para entendermos melhor, vamos implementar o seguinte problema
        Faça um programa em Java que leia 10 valores e ao final imprima a 
        média aritmética dos valores lidos.
    */

import java.util.Scanner;
public class LacoForEmJava {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        float num, soma = 0, media = 0;
        //usando um laço "for":
        //lembrando que: i++ => i = i + 1;
        
        for(int i = 1; i <= 10; i++){
            //esse bloco de código será repetido 10x
            
            System.out.println("Informe o número: "+i);
            
             num = leitorScanner.nextFloat();
            
            soma += num;//é o mesmo que soma = soma + num
        }
            //calcula a média:
            media = soma / 10;
            
            //impressão dos dados:
            System.out.println("A média é: "+media);
    }
}