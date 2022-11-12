package src;

import java.util.Scanner;
import java.io.*;

public class Exer6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double num, res;
		int resAr = 0;
		String a;
		System.out.println("Digite um número:");
		num = ent.nextDouble();

		for (int i = 1; i <= num; i++) {
		//For para pegar o divisor
			res = num % i;
			//calcular o resto do número pelo divisor
			if (res == 0) {
			//caso o resto seja 0, i é divisor
				System.out.println(i);
				resAr += i;
				//somar todos os divisores em uma variavel
			}
		}

		a = Integer.toString(resAr);
		//converter int para uma string

		try {
			FileWriter arq = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\Exer6.txt");
			arq.write(a);
			//gravar no txt, a string de resultados
			arq.close();
		} catch (IOException e) {
			System.out.println("Inválido");
			e.printStackTrace();
		}

		ent.close();
	}

}
