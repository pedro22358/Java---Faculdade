package lista3;

import java.util.Scanner;

public class Exercicio10 {
	public static char cat(int idade) {
		char cat;
		if (5<= idade && idade<=7) {	//usei if para poder definir um caractere para a variavel e usei a variavel de idade para condição
			cat = 'F';
			return(cat);
		}
		else if (8<=idade && idade<=10) {
			cat = 'E';
			return(cat);
		}
		else if (11<=idade && idade<=13) {
			cat = 'D';
			return(cat);
		}
		else if (14<=idade && idade<=15) {
			cat = 'C';
			return(cat);
		}
		else if (16<=idade && idade <=17) {
			cat = 'B';
			return(cat);
		}
		else {
			cat = 'A';
			return(cat);
		}
	}
	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int i;
	System.out.println("Digite a idade do nadador:");
	i = ent.nextInt();
	System.out.println("A classificação do nadador é: " + cat(i));	//chamar a função e retornar o valor total
	ent.close();
	}

}
