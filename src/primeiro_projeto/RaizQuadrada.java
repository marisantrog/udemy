package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui um numero para saber a raiz quadrada:");
		int num = sc.nextInt();
		double raiz = Math.sqrt(num);
		
		
		System.out.printf("A Raiz quadrada de " + num + " é: %.2f%n", raiz);
		
		sc.close();
	}
}
