package primeiro_projeto;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//---------Operadores Logicos------------------------------------
		
		Scanner sc = new Scanner(System.in);

		int A, B, C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if (A > B && A > C) {
			System.out.println("O maior numero digitado �: " + A);
			
		}
		
		else if (B > C) {
			System.out.println("O maior numero digitado �: " + B);
		}
		
		else {
			System.out.println("O maior numero digitado �: " + C);
		}
		sc.close();

	}

}
