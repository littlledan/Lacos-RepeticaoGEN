package LacoRepeticao;

import java.util.Scanner;

public class LacoDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, soma = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite numeros inteiros: ");
			num = scanner.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
		}while(num != 0);
		System.out.println("\nA soma dos numeros inteiros positivos é: " + soma);
	}
}
