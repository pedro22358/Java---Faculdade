package Lista;

import java.util.Scanner;

public class ajuda {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double sm,qq,vq,tq;
		System.out.println("Digite o valor do sal�rio minimo:");
		sm = ent.nextDouble();
		System.out.println("Digite a quantidade de quilowatts");
		qq = ent.nextDouble();
		vq = sm*10/100;
		System.out.println("A quantidade de quilowatts consumidas �: " + qq);
		tq = vq*qq;
		System.out.println("O valor a ser pago �: " + tq);
		tq = tq-(tq*15/100);
		System.out.println("O valor a ser pago com 15% de desconto �: " + tq);
		ent.close();
	}
}
