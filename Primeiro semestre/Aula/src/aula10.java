import java.util.Scanner;

public class aula10 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int soma = 0,num;
		char pal = 0;
		System.out.println("Digite um numero diferente de 0:");
		num = ent.nextInt();
		if (num != 0) {
			while (pal != 'a' ) {
				System.out.println("Digite um nu ero:");
				num = ent.nextInt();
				System.out.println("Digite a para parar:");
				pal = ent.next().charAt(0); 
				soma += num;
			}
			System.out.printf("A soma é: %d", soma);
		} else {
			System.out.print("Não tem soma");
		}

		ent.close();
	}

}
