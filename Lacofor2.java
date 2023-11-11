package LacoRepeticao;
import java.util.Scanner;
public class LacoFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contimp = 0, contpar = 0, x;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n\tEntre abaixo com 10 numeros diferentes!!!");
		
		for(x = 1; x <= 10; x++ ) {
			System.out.println("\nDigite um numero: ");
			num = scanner.nextInt();
			
			if(num % 2 == 0) {
				contpar++;
			}else {
				contimp++;
			}
		}System.out.println("\nTotal de numeros pares: " + contpar);
		 System.out.println("\nTotal de numeros impares: " + contimp);
	}
}
