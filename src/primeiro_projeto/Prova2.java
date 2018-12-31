package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Prova2 {

	public static void main(String[] args) {

		//------------------Ex1---------------------------
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//System.out.println("Digite um número:");
		//int num = sc.nextInt();
		
		//if (num > 0) {
			//System.out.println("O numero digitado é POSITIVO");
			
		//}
		//else {
			//System.out.println("O numero digitado é NEGATIVO");
		//}
		
		//-----------------Ex2-----------------------------------
		//System.out.println("Digite um número:");
		//int num = sc.nextInt();
		
		//if (num % 2 == 0) {
			//System.out.println("O numero é PAR");
		//}
		//else {
			//System.out.println("O numero é IMPAR");
		//}
		
		//---------------Ex3--------------------------------------
		//int A, B;
		
		//System.out.println("Digite dois números:");
		//A = sc.nextInt();
		//B = sc.nextInt();
		
		//if (A % B == 0 || B % A == 0 ) {
			//System.out.println("São Multiplos");
		//}
		//else {
			//System.out.println("Não são multiplos");
		//}
		//------------Ex4------------------------------------------
		//int horaIni, horaFim, duracao;
		
		//System.out.println("Digite a hora de início e fim:");
		//horaIni = sc.nextInt();
		//horaFim = sc.nextInt();
		

		//if (horaIni < horaFim) {
				//duracao = horaFim - horaIni;		
		//}
		//else {
			//duracao = 24 - horaIni + horaFim;
		//}
		//System.out.println("A duracao foi de: " + duracao + " HORA(s)");
		
		//-----------Ex5-------------------------------------------------
		//System.out.println("Digite o cod do produto e quantidade:");
		
		//int cod = sc.nextInt();
		//int qtd = sc.nextInt();
		
		//double total = 0;
		
		//if (cod == 1) {
			//total = qtd * 4.0;
		//}
		
		//else if (cod == 2) {
			//total = qtd * 4.5;
		//}
		
		//else if (cod == 3) {
			//total = qtd * 5.0;
		//}
		
		//else if (cod == 4) {
			//total = qtd * 2.0;
		//}
		
		//else if (cod == 5) {
			//total = qtd * 1.5;
		//}
		
		//System.out.printf("Total R$ %.2f%n", total);
		
		//-------------------Ex06----------------------------------------------
		//System.out.println("Digite um número");
		
		//double num = sc.nextDouble();
		
		//if (num < 0.0 || num > 100.0) {
			//System.out.println("Fora do Intervalo");	
		//}
		
		//else if (num <= 25.0) {
			//System.out.println("Intervalo [0,25]");	
		//}
		
		//else if (num <= 50.0) {
			//System.out.println("Intervalo [25,50]");	
		//}
		
		//else if (num <= 75.0) {
			//System.out.println("Intervalo [50,75]");	
		//}

		//else if (num <= 100.0) {
			//System.out.println("Intervalo [75,100]");	
		//}
		
		//----------------Ex07----------------------------------------------------
		//System.out.println("Digite um número");
		
		//double x = sc.nextDouble();
		//double y = sc.nextDouble();
		
		
		//if (x == 0.0 && y == 0.0) {
			//System.out.println("Ponto de Origem");
		//}
		
		//else if (x > 0.0 && y > 0.0) {
			//System.out.println("Q1");
		//}
		
		//else if (x < 0.0 && y < 0.0) {
			//System.out.println("Q3");
		//}
		
		//else if (x > 0 && y < 0) {
			//System.out.println("Q4");
		//}
		
		//else if (x < 0 && y > 0) {
			//System.out.println("Q2");
		//}
		
		//-----------------------Ex08--------------------------------------------
		System.out.println("Digite um número");
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		
		else if (salario <= 3000.0 ) {			
			 imposto = (salario - 2000.0) * 0.08; 
		}
		
		else if (salario <= 4500.00 ) {
			imposto = (salario - 3000.0) * 0.18 + (1000 * 0.08);
		}
		
		else  {
		    imposto = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08); 
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("Imposto de: %.2f%n", imposto);
		}
		
		sc.close();
	}	  	

}
