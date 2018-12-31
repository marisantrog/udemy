package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Prova3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/*System.out.println("Digite um número");
		int num = sc.nextInt();

		for (int cont = 1; cont <= num; cont ++) {
			
			if (cont%2 != 0) {
				int impar = cont;
				System.out.println(cont);
			}*/
		
		//----------------Ex02----------------------------
		/*System.out.println("Quantos números você irá digitar?");
		int n = sc.nextInt();
		
		int in=0;
		int out=0;
		
		for (int i=0;i<n;i++) {
			System.out.println("Digite o numero");
			int num = sc.nextInt();
			
			if (num >=10 && num <=20) {
				in = in +1;
			}
			else {
				out = out +1;
			}
		}
		System.out.println("in: "+ in);
		System.out.println("out: "+ out);
		*/
		//-------------------------Ex03---------------------------
		/*System.out.println("Quantos calculos voce quer fazer?");
		int n = sc.nextInt();
		
		for (int i =0; i<n;i++) {
		
		System.out.println("Digite 3 numeros com uma casa decimal: ");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		double media = ((num1 * 2.0)+(num2 * 3.0)+(num3 * 5.0))/10;
		
		System.out.printf("A media ponderada dos números é: %.1f%n", media);
		}
		*/
		//-----------------Ex04-------------------------------------------------
		/*System.out.println("Quantas divisoes voce quer fazer?");
		int n = sc.nextInt();
		
		for (int i =0;i <n;i++) {
			System.out.println("Digite dois numeros para divisão");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
			
				if (num2 == 0) {
					System.out.println("Divisão impossível");
				}
				else {
					double resultado = (double)num1 / num2;
					System.out.println("O resultado da divisão é: " + resultado);	
				}	
				
		}
		*/
		//----------------------------Ex05-------------------------------------------
		/*System.out.println("Quer saber o fatorial de que número?");
		int numero = sc.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <=numero ; i++) {
			fatorial = fatorial * i;
		}
		System.out.println("O fatorial de " + numero + " é: " + fatorial);
		*/
		//----------------------------Ex06-------------------------------------------
		/*System.out.println("digite um numero");
		int num = sc.nextInt();
		
		for (int i = 1; i <=num ; i++ ) {
			if (num % i ==0) {
				System.out.println(i);
			}
		}*/
		//--------------------------Ex07---------------------------------------------
		System.out.println("digite um numero");
		int num = sc.nextInt();
		
		for (int i = 1; i <=num ; i++ ) {
			int quadrado = (int) Math.pow(i,2);
			int cubo = (int) Math.pow(i, 3);
			
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		sc.close();
		} 
}
		