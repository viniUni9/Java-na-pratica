/*
Escreva um programa em linguagem Java que leia um peso na 
Terra e o número de um planeta e imprima o valor 
correspondente do peso neste planeta. 
A relação de planetas é dada a seguir juntamente com o 
valor das gravidades relativas à Terra.
Cód     Gravidade Relativa      Planeta
------------------------------------------
1           0,37                Mercúrio
2           0,88                Vênus
3           0,38                Marte
4           2,64                Júpter
5           1,15                Saturno
6           1,17                Urano
Para calcular o peso no planeta em questão, use a seguinte 
fórmula:
    PP = (PT / 10) * G
Sendo:
    PP = Peso no planeta
    PT = Peso na Terra
    G = Gravidade relativa
 */

import java.util.Scanner;

public class ExercicioPlanetas {

    public static void main(String[] args) {
        
     Scanner leitorScanner = new Scanner(System.in);
        
    //declarações:
    double pesoTerra, pesoPlaneta;
    
    int numPlaneta;
    
    //leituras:
    
    System.out.println("Informe seu peso na Terra:");
    
    pesoTerra = leitorScanner.nextDouble();
    
    System.out.println("Informe o numero do planeta:");
    
     System.out.println("1-Mercúrio; 2-Vênus; 3-Marte; 4-Júpter; 5-Saturno; "
             + "6-Urano");
     
     numPlaneta = leitorScanner.nextInt();
     
     switch (numPlaneta) {
        case 1:
            pesoPlaneta = (pesoTerra / 10) * 0.37;
            break;
        case 2:
            pesoPlaneta = (pesoTerra / 10) * 0.88;
            break;
        case 3:
            pesoPlaneta = (pesoTerra / 10) * 0.38;
            break;
        case 4: 
            pesoPlaneta = (pesoTerra / 10) * 2.64;
            break;
        case 5:
            pesoPlaneta = (pesoTerra / 10) * 1.15;
            break;
        case 6:
            pesoPlaneta = (pesoTerra / 10) * 1.17;
            break;
        default:
            System.out.println("Planeta inválido!");
            
            pesoPlaneta = leitorScanner.nextDouble();
     }
        System.out.println("Seu peso no planeta escolhido é" + pesoPlaneta);       
    }
}