
public class DesvioCondicional {

    public static void main(String[] args) {
        float nota1 = 5;
        
        float nota2 = 5;
        
        float media = (nota1 + nota2) / 2;
        
        //desvio simples, por UMA única condição
        
        if(media >= 6){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
