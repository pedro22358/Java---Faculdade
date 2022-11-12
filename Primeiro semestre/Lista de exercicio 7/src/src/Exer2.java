package src;

import java.io.*;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String texto;
		System.out.println("Digite seu texto:");
		texto = ent.nextLine();
		//Gravar o texto digitado pela pessoa em uma string
		try {
			//FileWriter para poder escrever no arquivo
			FileWriter arq = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\Exer2.txt");
			arq.write(texto);
			//Escrever no arquivo, a string txt
			arq.close();
		} catch (IOException e) {
			System.out.println("Inválido.");
		}
		ent.close();

	}

}
