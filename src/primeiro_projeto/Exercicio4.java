package primeiro_projeto;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//--------------------Ex01--------------------------------------
		
		/*System.out.println("Digite a senha de 4 digitos: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Incorreta, digite novamente:");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		*/
		//------------------Ex2------------------------------------------
		/*System.out.println("Digite dois números: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x !=0 && y !=0) {
					
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			
			else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			
			System.out.println("Digite dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		*/
		
		//-----------------------Ex3---------------------------------
		System.out.println("Digite o código do combustível desejado: ");
		
		int cod = sc.nextInt();
		
		int ALCOOL = 0;
		int GASOLINA = 0;
		int DIESEL = 0;
		
		while (cod != 4) {
		
			if (cod == 1) {
					ALCOOL = ALCOOL + 1;
			}
			else if(cod == 2) {
					GASOLINA = GASOLINA +1;
			}
			else if(cod == 3) {
					DIESEL = DIESEL + 1;
			}
			
			System.out.println("Digite outro código: ");
			cod = sc.nextInt();			
		}
		
		System.out.println("MUITO OBRIGADO! ");
		System.out.println("ALCOOL:" + ALCOOL);
		System.out.println("GASOLINA:" + GASOLINA);
		System.out.println("DIESEL:" + DIESEL);
		
		sc.close();
	}	
	
}
