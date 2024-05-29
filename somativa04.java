package Somativa;

public class somativa04 {

	public static void main(String[] args) {
		
		double[] numeros = new double[15]; //
		System.out.println("Digite 15 números:"); // Responsável por mostrar essa mensagem na tela do usuario 
		for (int i = 0; i < 15; i++) { //A palavra-chave que inicia a estrutura do l(int i = 0;: Esta parte é a inicialização do loop. Aqui, declaramos e inicializamos uma variável chamada i do tipo inteiro com o valor inicial de 0.oop for.
		System.out.print("Número " + (i + 1) + ": "); //para imprimir uma mensagem no console, solicitando um número ao usuário, e também exibe o número da iteração atual do loop.
		numeros[i] = scanner.nextDouble(); //atribui um valor double digitado pelo usuário para um elemento específico dos numeros.
		}
		double soma = 0;
		for (int i = 0; i < 15; i++) { //Declara a variável chamada soma com o valor 0
		soma += numeros[i];//durante o loop, cada elemento do numeros é adicionado à variável soma.
		}
		System.out.println("A soma dos números é: " + soma); //mostra o resultado da soma pro usuario 
		scanner.close();//encerra o codigo 
		

	}

}
