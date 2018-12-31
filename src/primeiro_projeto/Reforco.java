package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Reforco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/*System.out.println("Digite as 3 notas no aluno:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double notaFinal = n1 + n2 + n3; 
		
		System.out.printf("Nota: %.2f%n" ,notaFinal);
		
		if (notaFinal <= 60.00) {
			System.out.println("Não passou!");
		}
		*/
		//--------------------------------Ex2----------------------------
		/*System.out.println("Digite o valor da glicose");
		double glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.println("Taxa de glicose Normal");
		}
		
		else if(glicose <= 140) {
			System.out.println("Glicose Alta");
		}
		
		else {
			System.out.println("Diabetes");
		}
		---------------------------------Ex3------------------------------------*/
		/*System.out.println("Digite dois numeros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
        int maior = 0;
        int menor = 0;
		
        if (num1 < num2) {
        	maior = num2;
        	menor = num1;
        }
        else {
        	maior = num1;
        	menor = num2;
        }
        
        int soma = 0;
		for (int i = menor;i<=maior;i++ ) {
			 if (i % 2 != 0) {
				 soma += i;
			 }
			 
		}
		System.out.println("A soma dos números ímpares é: " + soma);
		--------------------------Ex4------------------------------------*/
		/*System.out.println("digite um número");
		
		int num = sc.nextInt();
		
		while (num != 0) {
			int quadrado = num * num;
			System.out.println("O quadrado de " + num + " é: " + quadrado);
			
			System.out.println("digite um número");
			num = sc.nextInt();
		}
		--------------------------Ex5-------------------------------------*/
		System.out.println("vai lançar notas de quantos alunos");
		
		int qtdAlunos = sc.nextInt();
		
		for (int i = 1; i <= qtdAlunos; i++) {
			System.out.println("Digite as notas no Aluno" + i);
			
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			
			double soma = nota1 + nota2 + nota3;
			System.out.println("A nota final é: " + soma);
		}
		sc.close();

	}

}
