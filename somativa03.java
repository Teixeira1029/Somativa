package Somativa;

import java.util.Scanner;

public class somativa03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); //cria um scanner para ler a entrada do usuario
		System.out.println("Informe o dia da semana: "); //mostra essa mensagem na tela do usuario 
		
		 int dia;
		 dia= ler.nextInt();
		 
		switch (dia) {
		case 1: //nome da variavel 
			System.out.println("Domingo"); //mostra essa mensagem na tela do usuario caso o numero seja 1
			break;//para a operação aqui 
			
		case 2://nome da variavel 
			System.out.println("Segunda");//mostra essa mensagem na tela do usuario caso o numero seja 2
			break;//para a operação aqui 
			
		case 3://nome da variavel 
			System.out.println("Terça");//mostra essa mensagem na tela do usuario caso o numero seja 3
			break;//para a operação aqui 
		case 4://nome da variavel 
			System.out.println("Quarta");//mostra essa mensagem na tela do usuario caso o numero seja 4
			break;//para a operação aqui 
		case 5://nome da variavel 
			System.out.println("Quinta");//mostra essa mensagem na tela do usuario caso o numero seja 5
			break;//para a operação aqui 
		case 6://nome da variavel 
			System.out.println("sexta");//mostra essa mensagem na tela do usuario caso o numero seja 6
			break;//para a operação aqui 
		case 7://nome da variavel 
			System.out.println("sábado");//mostra essa mensagem na tela do usuario caso o numero seja 7
			break;//para a operação aqui 
			
		default:
			System.out.println("Dia invalido");//mostra essa mensagem na tela do usuario caso digite um numero invalido 

		}
	}
	
}
