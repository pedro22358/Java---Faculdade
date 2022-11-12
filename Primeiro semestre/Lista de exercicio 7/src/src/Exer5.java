package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\Exer2.txt");
		//chamar o arquivo txt
		File arq1 = new File("C:\\Users\\joojp\\Desktop\\texto\\Exer1.txt");
		//chamar o arquivo txt
		try {
			FileWriter arqes = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\Exer5.txt");
			//criar um novo FileWriter
			String l1;
			String l2;

			Scanner ent = new Scanner(arq);
			//Scanner para poder fazer a leitura
			Scanner ent1 = new Scanner(arq1);
			//Scanner para poder fazer a leitura

			while (ent1.hasNextLine()) {
			//While para ler o arquivo linha a linha
				l1 = ent1.nextLine();
				//salvar a linha em uma string
				arqes.write(l1);
				//salvar a string no arquivo
			}

			arqes.write(" ");

			while (ent.hasNextLine()) {
			//While para ler o arquivo linha a linha
				l2 = ent.nextLine();
				//salvar a linha em uma string
				arqes.write(l2);
				//salvar a string no arquivo
			}

			ent.close();
			ent1.close();
			arqes.close();
		} catch (IOException e) {
			System.out.println("Inválido.");
		}

	}

}
