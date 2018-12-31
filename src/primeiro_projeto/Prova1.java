package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Prova1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//-----------------------------Ex2-------------------------------------------
		
		//double raio = sc.nextDouble();
		//double pi = 3.14159;
		
		//double resultado = pi * (raio * raio);
		
		//System.out.printf("Area = %.4f%n",resultado);
		
		//sc.close();
		
		//------------------------------Ex3----------------------------------------
		
		//int A, B, C, D, dif;
		
		//A = sc.nextInt();
		//B = sc.nextInt();
		//C = sc.nextInt();
		//D = sc.nextInt();
		
		//dif = (A * B) - (C * D);
		
		//System.out.println("DIFERENCA = " + dif);
		
		//-----------------------------Ex4-----------------------------------------
		
		//int num, hora;
		//double valorHora, salario;
		
		//num = sc.nextInt();
		//hora = sc.nextInt();
		//valorHora = sc.nextDouble();
		
		//salario = hora * valorHora;
		
		//System.out.println("NUMBER = " + num);
		//System.out.printf("SALARY = U$ %.2f", salario);
		
		//sc.close();
		
		//-----------------------------Ex5-----------------------------------------
		
		//int cod1, cod2, qtdPeca1, qtdPeca2;
		//double preco1, preco2, valor;
		
		//cod1 = sc.nextInt();
		//qtdPeca1 = sc.nextInt();
		//preco1 = sc.nextDouble();
		
		//cod2 = sc.nextInt();
		//qtdPeca2 = sc.nextInt();
		//preco2 = sc.nextDouble();
		
		//valor = (qtdPeca1 * preco1) + (qtdPeca2 * preco2);
		
		//System.out.printf("VALOR TOTAL: R$ %.2f%n", valor);

		//sc.close();
		
		//--------------------------Ex6---------------------------------------------
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C= sc.nextDouble();
		
		triangulo = (A * C) / 2.0 ;
		circulo = pi * (C * C);
		trapezio = ((A + B)/2) * C;
		quadrado = B * B;
		retangulo = A * B;
				
		System.out.printf("TRIANGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPEZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);
		
		sc.close();
	
		
	}

}
