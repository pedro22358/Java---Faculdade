import java.util.Scanner;

public class Exercicio1 {
	public static void valor(double [] notas) {
		Scanner ent = new Scanner(System.in);
		for(int pos=0;pos<10;pos++) {
			System.out.print("Digite a nota:");
			notas [pos] = ent.nextDouble();
		}
		}
		public static void media(double [] notas) {
			int mediatotal=0;
			int aluno=0;
			for(int pos=0;pos<10;pos++) {
				mediatotal+=notas[pos];
			}
			mediatotal /= 10;
			
			System.out.println("A média foi: " + mediatotal);
			for(int pos=0;pos<10;pos++) {
				if(notas[pos]>mediatotal) {
					aluno++;
				}
			}
			System.out.println("A quantidade de alunos acima da media é: " + aluno);
	}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double [] notas = new double [10];
		valor(notas);
		media(notas);
		ent.close();
	}

}
