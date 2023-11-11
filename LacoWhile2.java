package LacoRepeticao;
import java.util.Scanner;
public class LacoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, genero = 0, cargo = 0, back = 0, mfront = 0, hmob = 0, full = 0, total = 0, idadeg = 0;
		double media;
		String resp = "S";
		Scanner scanner = new Scanner(System.in);
				
		while(resp.equalsIgnoreCase("S")) {
			System.out.println("\nIdade: ");
			idade = scanner.nextInt();
			idadeg += idade;
			System.out.println("\n\tInforme seu genero mediante codigo da tabela: ");
			System.out.println("\n\n1- Mulher cis");
			System.out.println("\n2- Homem cis");
			System.out.println("\n3- Não binario");
			System.out.println("\n4- Mulher trans");
			System.out.println("\n5- Homem trans");
			System.out.println("\n6- Outros");
			System.out.println("\nInforme o codigo do Genero: ");
			genero = scanner.nextInt();
			System.out.println("\n\tInforme seu cargo mediante ao codigo da tabela: ");
			System.out.println("\n\n1- Backend");
			System.out.println("\n2- Frontend");
			System.out.println("\n3- Mobile");
			System.out.println("\n4- FullStack");
			System.out.println("\nInforme o codigo do Cargo: ");
			cargo = scanner.nextInt();
			
			if(cargo == 1) {
				back += 1;
			}
			if((genero == 1 || genero == 4) && cargo == 2) {
				mfront += 1;
			}
			if((genero == 2 || genero == 5) && cargo == 3 && idade > 40) {
				hmob += 1;
			}
			if(genero == 3 && cargo == 4 && idade < 30) {
				full += 1;
			}
			total += 1;
			
			System.out.println("\nDeseja continuar a pesquisa?(S para sim e N para não): ");
			resp = scanner.next();
		}
		
		System.out.println("\nTotal de Pessoas desenvolvedoras Backend: " + back);
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mfront);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + hmob);
		System.out.println("\nTotal de Pessoas Não Binários desenvolvedores FullStack menores de 30 anos: " + full);
		System.out.println("\nTotal de Pessoas que responderam a pesquisa: " + total);
		media = idadeg / total;
		System.out.println("\nA media de idade das pessoas que responderam a pesquisa é: " + media);
		
	}

}
