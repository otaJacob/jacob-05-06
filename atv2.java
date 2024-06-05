package atv05do06;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 

		System.out.print("Cadastre uma senha (Apenas Números): "); 

		int senhaMestre = ler.nextInt(); 

		System.out.print("Digite um número: "); 

		double n1 = ler.nextDouble(); 

		System.out.print("Digite outro número: "); 

		double n2 = ler.nextDouble(); 

		double soma = n1 + n2; 

		System.out.print("Digite a sua senha para desbloquear a soma: "); 

		int senhaTentativa = ler.nextInt(); 

		if (senhaTentativa == senhaMestre) { 

			System.out.println("A soma é: " + soma); 

		} else { 

			System.out.println("Erro! Senha errada!"); 

		} 

		ler.close(); 

	} 



}


