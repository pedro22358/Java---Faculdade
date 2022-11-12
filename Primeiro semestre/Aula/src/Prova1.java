import java.util.Scanner;
public class Prova1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int N,i, idade, im=0, in=0, ir = 0, idf=0, fn=0,fr=0,tf,it;
		char sexo, registro;
		System.out.println("Digite o total de pessoas:");
		N = ent.nextInt();
		for (i=1;i<=N;i++) {
			System.out.print("Digite o sexo: m-masulino f-feminino");
			sexo = ent.next().charAt(0);
			switch(sexo) {
			case 'm':
				System.out.println("Digite a idade:");
				idade = ent.nextInt();
				im = idade+im;
				System.out.println("Digite o registro: n-novo ou r-reincidencia");
				registro = ent.next().charAt(0);
				switch(registro) {
				case 'n':
					in++;

				case 'r':
					ir++;
	
				}

			case 'f':
				System.out.print("Digite a idade");
				idade = ent.nextInt();
				idf = idade+idf;
				System.out.println("Digite o registro: n-novo ou r-reincidencia");
				registro = ent.next().charAt(0);
				switch(registro) {
				case 'n':
					fn++;

				case 'r':
					fr++;

			}
			}
			System.out.print("A quantidade de vitimas femininas" + (tf = fn+fr));
			System.out.print("A media de idades total" + (it = idf+im));
			if (ir>fr) {
				System.out.print("Houve mais casos de reincidencia masculina");
			}
			else if (fr>ir) {
				System.out.print("Houve mais casos de reincidencia feminina");
			}
			else {
				System.out.print("Houveram casos iguais de reincidencia");
			}
		}
	}
}
