package primeiro_projeto;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número");
		int num = sc.nextInt();
		
		while (num < 1) {
			System.out.println("Digite um numero positivo");
			num = sc.nextInt();
		}
		
		int maior = Integer.MIN_VALUE;
		
		for (int i=1; i <= num; i++) {
			System.out.println("Value #" + i);
			int valor = sc.nextInt();
			
			if (valor > maior) {
				maior = valor;
			}
		}
	    System.out.printf("O maior número digitado foi: " + maior);	
		sc.close();
	}

}
