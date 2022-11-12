package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Pessoas{
	private String nome;
	private int dia;
	private int mes;
	
	public Pessoas(String no, int m, int d) {
		nome = no;
		dia = d;
		mes = m;
	}
	
	public int getMes() {
		return mes;
	}
	public String getNome() {
		return nome;
	}
	public int getDia() {
		return dia;
	}
	
}

public class Exer2 {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Pessoas [] vet = new Pessoas[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Digite o nome:");
			String nome = ent.nextLine();
			System.out.println("Digite o dia de aniversário:");
			int dia = ent.nextInt();
			System.out.println("Digite o mês de aniversário: (Exemplo: 1)");
			int mes = ent.nextInt();
			ent.nextLine();
			
			vet[i] = new Pessoas(nome,mes,dia);
		}
		System.out.println("Digite o nome do arquivo para realizar a gravação: (Exemplo: Atividade.txt)");
		String arqui = ent.nextLine();
		try {
			FileWriter arq = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\lista8\\"+arqui);
			arq.write("Janeiro");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 1) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Fevereiro");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 2) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Março");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 3) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Abril");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 4) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Maio");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 5) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Junho");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 6) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Julho");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 7) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Agosto");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 8) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Setembro");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 9) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Outubro");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 10) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Novembro");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 11) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			arq.write("\n");
			arq.write("Dezembro");
			arq.write("\n");
			for(int j=0;j<10;j++) {
				int mes = vet[j].getMes();
				if(mes == 12) {
					arq.write(vet[j].getNome()+" "+vet[j].getDia());
					arq.write("\n");
				}
			}
			
			
			arq.close();
		} 
			catch (IOException e) {
			e.printStackTrace();
		}
		
		
		ent.close();
	}

}
