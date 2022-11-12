package src;

import java.io.*;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\Exer4.txt");
		//Chamar o arquivo txt
		try {
			Scanner ent = new Scanner(arq);
			//Scanner para fazer a leitura do arquivo
			int j = 0;
			String i;
			while (ent.hasNextLine()) {
			//While para ler linha a linha
				j++;
				//Contar quantas linhas tem o txt
				i = ent.nextLine();
				//Salvar a linha em uma string
				System.out.println(i);
				//Printar a string
			}
			System.out.println("A quantidade de linhas é:" + j);
			ent.close();
		} catch (IOException e) {
			System.out.println("Inválido.");
		}
	}

}
