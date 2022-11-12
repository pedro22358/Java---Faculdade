package capitulo4;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n1,n2,n3,p1,p2,p3,r;
		System.out.println("Digite o valor do trabalho de laboratorio: \nDigite o valor da nota da avaliação: \nDigite o valor do exame final:");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		n3 = ent.nextDouble();
		if (n1 > 10 || n2 > 10 || n3>10) {
			System.out.print("Notas invalidas");
		}
		else {
		p1 = 2;
		p2 = 3;
		p3 = 5;
		r = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
		System.out.printf("A media ponderada foi: %.2f \n", r);
		if (r>=8 && r <=10) {
			System.out.print("A nota foi A, exelente.");
			}
		else if (r>=7 && r<8) {
			System.out.print("A nota foi B, muito bom.");
		}
		else if (r>=6 && r<7) {
			System.out.print("A nota foi C, Mediana.");
		}
		else if (r>=5 && r<6) {
			System.out.print("A nota foi D, Abaixo da media.");
		}
		else {
			System.out.print("Nota E, Pessimo.");
		}
		}
		ent.close();
	}

}
