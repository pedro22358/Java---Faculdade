package src;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Lista x = new Lista();
		for(int i=0;i<4;i++) {
			Celula y = new Celula();
			if(ent.hasNextLine()) {
				ent.nextLine();
			}
			System.out.println("Digite um nome:");
			y.nome = ent.nextLine();
			System.out.println("Digite a idade:");
			y.idade = ent.nextInt();
			x.InserirInicio(y);
		}
		System.out.println("Tamanho: " + x.getTam());
		x.mostrar();
		System.out.println("Media iterativa: " + x.funcint());
		
	}

}
