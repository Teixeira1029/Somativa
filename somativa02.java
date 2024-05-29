package Somativa;

import java.util.Scanner;

public class somativa02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //cria um scanner para ler a entrada do usuario
		double A; //lê o valor da variavel de a
		System.out.print("Informe valor da base  : "); //apresenta essa mensagem na tela do usuario 
        double b = scanner.nextDouble(); //lê o valor da variavel de b
        
        System.out.print("Informe valor altura : ");//apresenta essa mensagem na tela do usuario
        double h = scanner.nextDouble(); //lê o valor da variavel de h
        A = b*h/2; //calcula a area do triangulo 
        System.out.print("A area do triangulo é : " + A ); //apresenta o resultado na tela do usuario
        
        
        
        

	}

}
