import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1 {
	
	public static void adicionar(ArrayList<String> x) {
		Scanner ent1 = new Scanner(System.in);
		String n = null;
		while(!"stop".equals(n)) {
			System.out.println("Digite um nome, ou stop para parar.");
			n = ent1.nextLine();
			if(!"stop".equals(n)) {
				x.add(n);
			}
		}
	}

	public static void mostrar(ArrayList<String> x) {
		for(int i = 0; i<x.size();i++) {
			System.out.println(x.get(i));	
		}
	}
	
	public static boolean pesquisaiterativa(ArrayList<String> x,String pesquisa) {
		boolean retorno = false;
		for(int i = 0; i<x.size();i++) {
			if(x.get(i).equals(pesquisa)){
				retorno = true;
				i = x.size();
			}
		}
		return retorno;
	}

	public static boolean pesquisabinaria(ArrayList<String> x,String pesquisa) {
		boolean retorno = false;
		int dir = x.size()-1, esq = 0, meio; 
		while(esq<=dir) {
			meio = (esq+dir)/2;
			if(x.get(meio).equals(pesquisa)) {
				retorno = true;
				esq = x.size();
			}
			else if(meio > (x[meio]))
			
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		ArrayList<String> x = new ArrayList<String>();
		adicionar(x);
		mostrar(x);
		System.out.println("Nome a ser pesquisado:");
		String pesquisa = ent.nextLine();
		if(pesquisaiterativa(x,pesquisa)) {
			System.out.println("O nome foi encontrado (iterativa)");
		}
		else {
			System.out.println("O nome não foi encontrado (iterativa)");
		}
		
		if(pesquisabinaria(x,pesquisa)) {
			System.out.println("O nome foi encontrado (binaria)");
		}
		else {
			System.out.println("O nome não foi encontrado (binaria)");
		}
		
	}

}
