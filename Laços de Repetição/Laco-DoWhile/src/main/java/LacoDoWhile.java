import java.util.Scanner;
public class LacoDoWhile {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        int num; //este será o número lido
        
        System.out.println("Inicie a digitação de números...");
        
        do{
            System.out.println("Informe um número ou um multiplo de "
                    + "6 para terminar:");
            
            num = leitorScanner.nextInt();
            
            System.out.println("Quadrado de " + (num * num));
            
        }while((num % 6) != 0);
            System.out.println("Finalizado!");
    }
}