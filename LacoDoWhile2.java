package LacoRepeticao;
import java.util.Scanner;
public class LacoDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, media = 0, media2 = 0;
		float result;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um numero: ");
			num = scanner.nextInt();
			if(num % 3 == 0 && num != 0) {
				media += num;
				media2++;
			}
			
		}while(num != 0);
		result = (float)media / media2;
		System.out.println("\nA media de todos os numeros multiplos de 3 é: " + result);
		
	}
}
