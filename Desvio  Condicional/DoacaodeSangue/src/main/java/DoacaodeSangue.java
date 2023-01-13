/*
  O hospital local está fazendo uma campanha para receber 
    doação de sangue.
    O doador deve inicialmente se cadastrar informando o seu nome 
    completo, sua idade, seu peso, responder a um breve questionário 
    e apresentar um documento oficial com foto.
    Faça um programa que permita ao hospital realizar o cadastro 
    dos voluntários para avaliar a aptidão quanto à doação de sangue. 
    Para estar apto a doar, o voluntário deve ter idade
    entre 16 e 69, pesar pelo menos 50 kg, estar bem alimentado e 
    não estar resfriado. 
    O programa deve ler os dados e imprimir no final o nome do 
    voluntário e se ele está apto ou não.
 */
import java.util.Scanner;

public class DoacaodeSangue {

    public static void main(String[] args) {
       //declarações das variáveis:
    
       String nome;
    
        int idade, bemAlimentado, resfriado;
    
        float peso;
        
        Scanner  leitorScanner = new Scanner(System.in);
        
        System.out.println("Informe o nome");
        
        nome = leitorScanner.nextLine();
        
        System.out.println("Informe o peso");
        
        peso = leitorScanner.nextFloat();
        
        System.out.println("Informe a idade");
        
        idade = leitorScanner.nextInt();
        
        System.out.println("Está bem alimentado?  <1 - Sim / 0 - Não:  ");
        
        bemAlimentado = leitorScanner.nextInt();
        
        System.out.println("Está resfriado?  <1 - Sim / 0 - Não:  ");
        
        resfriado = leitorScanner.nextInt();
        
        //verificação da aptidão...:
        
        if(peso > 50 && bemAlimentado == 1 && resfriado == 0 && idade >= 16 
                && idade <= 69){
            System.out.println("Está apto!" + nome);
        }
        else{
            System.out.println("Não está apto!" + nome);
        }   
    }
}