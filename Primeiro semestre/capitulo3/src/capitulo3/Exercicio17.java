package capitulo3;
import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double vd, c1, c2, i1, i2, vt;
		System.out.println("Digite o valor do deposito:");
		vd = ent.nextDouble();
		System.out.println("Digite o valor do cheque 1:");
		c1 = ent.nextDouble();
		System.out.println("Digite o valor do cheque 2:");
		c2 = ent.nextDouble();
		
		i1 = c1 * 0.38/100;
		i2 = c2 * 0.38/100;
		vt = vd - c1 - c2 - i1 - i2;
		System.out.printf("Saldo: %.2f", vt);
		ent.close();
		
		
	}

}
