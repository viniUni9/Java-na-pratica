import java.util.Scanner;
public class OperadoresAritimeticos {

    public static void main(String[] args) {
        
       Scanner leitorScanner = new Scanner(System.in);
        
        float a;
        
         System.out.println("Informe o primeiro valor:");
          
         a = leitorScanner.nextFloat();
          
        float b;
        
        System.out.println("Informe o segundo valor:");
     
        b = leitorScanner.nextFloat();
        
        float soma = a + b;
        
        float subtracao = a - b;
        
        float multiplicacao = a * b;
        
        float divisao = a / b;
        
        System.out.println("A soma é:" + soma);
        
        System.out.println("A subtração é:" + subtracao);
        
        System.out.println("A multiplicação é:" + multiplicacao);
        
        System.out.println("A divisão é:" + divisao);
    }
}
