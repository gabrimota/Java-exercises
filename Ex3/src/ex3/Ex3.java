package ex3;
// importação do scanner para utilizar ele
import java.util.Scanner;

public class Ex3 {
	/*Crie um programa que receba 2 números e um operador (+, -. *,/) e faça a respectiva operação.*/

	public static void main(String[] args) {
		// variaveis inteiras
		int num , num2 , somas;
		// variaveis strings criada para guardar os sinal de cada operação
		 // essa var sinal recebe o sinal que o usuario quer utilizar na operação
		String sinal;
		// já esses abaixo são usados para comprar com a var sinal para sabermos qual operação fazer
		String soma = "+";
		String sub = "-";
		String mult= "*";
		String div = "/";
		// criamos o scanner aqui(ele recebe o que o usuario digita)
		Scanner scanner = new Scanner(System.in);
		// pedimos os números utlizando o print e guardamos nas variaveis num e num2
		System.out.print("Digite o primeiro número: ");
			num = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
			num2 = scanner.nextInt();	
		// pedimos o sinal da operação e guardamos na var sinal
		System.out.print("Digite o sinal da operação: ");
			sinal = scanner.next();
			
		if(sinal.equals(soma) ) {
			System.out.printf("A soma dos números deu: %d", (num + num2));
		} if(sinal.equals(sub) ) {
			System.out.printf("A subtração dos números deu: %d", (num - num2));
		} if(sinal.equals(mult) ) {
			System.out.printf("A multiplicação dos números deu: %d", (num * num2));
		} if(sinal.equals(div) ) {
			System.out.printf("A divisão dos números deu: %d", (num / num2));
		} 
		
	}

}