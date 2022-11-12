package lista2;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double c=1,v,r,p,la=0,lm=0,lal=0,tc=0,lt=0,tv=0;
		System.out.println("Digite o valor da compra: (ou zero para parar)");
		c = ent.nextDouble();
		while(c>0) {
			System.out.println("Digite o valor da venda do produto:");
			v = ent.nextDouble();
			tc = tc+c;
			tv = tv+v;
			r = v-c;
			p = r*(c/100);
			if(p<10) {
				la++;
			}
			else if(10<=p && p<=20) {
				lm++;
			}
			else {
				lal++;
			}
			lt = tv-tc;
			System.out.println("Digite o valor da compra: (ou zero para parar)");
			c = ent.nextDouble();
		}
		System.out.println("A quantidade de produtos com lucro abaixo de 10% é: " + la);
		System.out.println("A quantidade de produtos com lucro entre 10% e 20%: " + lm);
		System.out.println("A quantidade de produtos com lucro acima de 20% é:  " + lal);
		System.out.println("O total de compra é: " + tc + "RS");
		System.out.println("O total de venda é: " + tv + "RS");
		System.out.println("O lucro total é: " + lt);
		ent.close();
	}

}
