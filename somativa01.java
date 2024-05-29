package Somativa;

import java.util.Scanner;

public class somativa01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //cria um scanner para ler a entrada do usuario 
		
		System.out.print("Informe valor a : ");//mostra esse texto na tela do usuario 
        double a = scanner.nextDouble(); //lê o valor da variavel de a
        
        System.out.print("Informe valor b : ");//mostra esse texto na tela do usuario
        double b = scanner.nextDouble();//lê o valor da variavel de a
        
        double soma = a+b; //soma o valor a e b
        
        double sub = a-b; //subitrai o valor a e b
        
        double mult = a*b; //multiplica o valor a e b
        
        double div = a/b; //divide o valor a e b
        
        System.out.println(" soma: " + soma ); //exibe o resultado da soma 
        System.out.println(" sub: " + sub ); //exibe o resultado da sub
        System.out.println(" mult: " + mult); //exibe o resultado da multiplicação 
        System.out.println(" div: " + div); //exibe o resultado da divisão 
        

	}

}
