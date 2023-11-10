package LacoRepeticao;
import java.util.Scanner;
public class LacoFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, x = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n\t\tLeve em consideração que o primeiro numero deve ser menor que o segundo!");
		System.out.println("\nDigite o primeiro valor: ");
		n1 = scanner.nextInt();
		System.out.println("\nDigite o segundo valor: ");
		n2 = scanner.nextInt();
		
			if(n1 > n2) {
				System.out.println("\nIntervalo invalido");
				System.exit(0);
			}
		
			System.out.println("\nEsses são os nomeros multiplos de 3 e 5, no intervalo definido.");
			
		for(x = n1; x <= n2;x++ ) {
			if(x % 3 == 0 && x % 5 == 0) {
				System.out.println("\nNumero " + x);
			}
	   }
	}
}
