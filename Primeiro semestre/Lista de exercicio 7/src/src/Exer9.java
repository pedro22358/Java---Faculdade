package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		int n;
		Scanner ent = new Scanner(System.in);
		try {
			FileWriter arqes = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\Exer9.txt");
			String str;

			System.out.println("Defina a quantidade de alunos:");
			n = ent.nextInt();
			for (int i = 0; i < n; i++) {
			//for para poder colocar as matriclas e o n�mero de telefone
				System.out.println("Digite a matr�cula");
				str = ent.nextLine();
				if (i == 0) {
					str = ent.nextLine();
				}
				arqes.write(str);
				//salvar a matricula
				arqes.write(" - ");
				System.out.println("Digite o n�mero de telefone: (XXXXXXXX)");
				str = ent.nextLine();
				arqes.write(str);
				//salvar o n�mero de telefone
				arqes.write("\n");
			}

			arqes.close();
		} catch (IOException e) {
			System.out.println("Inv�lido.");
		}

		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\Exer9.txt");
		//chamar o arquivo
		try {
			Scanner ent1 = new Scanner(arq);
			String i;
			while (ent1.hasNextLine()) {
			//ler linha por linha
				i = ent1.nextLine();
				System.out.println(i);
				//printar as informa��es de matricula e n�mero de telefone
			}
			ent1.close();
		} catch (IOException e) {
			System.out.println("Inv�lido.");
		}
		ent.close();
	}

}
