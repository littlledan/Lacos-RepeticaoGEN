package LacoRepeticao;
import java.util.Scanner;
public class LacoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contmenor21 = 0, contmaior50 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nDigite as Idades: ");
		num = scanner.nextInt();
		
		while(num >= -1) {
			if(num < 21) {
				contmenor21 ++;
				
			}else if(num > 50){
				contmaior50 ++;
			}
			
			System.out.println("\nContinue:(Para encerrar, digite um numero negativo)");
			num = scanner.nextInt();
			
		}
		System.out.println("\nO numero de pessoas com idade inferior a 21 é: " + contmenor21);
		System.out.println("\nO numero de pessoas com idade superior a 50 é: " + contmaior50);
		
	}

}
