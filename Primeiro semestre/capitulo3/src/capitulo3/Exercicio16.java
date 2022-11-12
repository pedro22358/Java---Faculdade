package capitulo3;
import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double ht, sm, h, sb, i, sr;
		System.out.println("Horas trabalhadas:");
		ht = ent.nextDouble();
		System.out.println("Valor do salario minimo:");
		sm = ent.nextDouble();
		h = sm / 2.0;
		sb = h*ht;
		i = sb*3/100;
		sr = sb - i;
		
		System.out.printf("Valor por hora trabalhada: %.2f, Valor do salario bruto: %.2f, Valor do imposto: %.2f, Valor do salario a receber: %.2f", h, sb, i, sr);
		ent.close();
		
		

	}

}
