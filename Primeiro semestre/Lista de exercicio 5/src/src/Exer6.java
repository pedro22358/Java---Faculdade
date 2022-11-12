package src;

//import java.util.Random;	//import para preencher números aleatorios, afim de testar a matriz
import java.util.Scanner;

public class Exer6 {
	public static void preenc(int[][] mat) {	//procedimento para preencher uma matriz
		Scanner ent = new Scanner(System.in);
		for (int ln = 0; ln < mat.length; ln++) {
			for (int col = 0; col < mat[0].length; col++) {
				System.out.printf("Digite um número [%d][%d]:", ln, col);
				mat[ln][col] = ent.nextInt();
				//Random gen = new Random();	//usado para testar o exercicio, favor desconsiderar
				//mat[ln][col] = gen.nextInt(10);	//usado para testar o exercicio, favor desconsiderar
			}
		}
	}

	public static void troca1(int[][] mat) {	//procedimento para trocar a linha 2 com a linha 8 da matriz e salvar ela global
		int[] linha2 = new int[10];		//usei vetor para poder salvar a linha e trocar com outra linha do vetor		
		int[] linha8 = new int[10];		//usei vetor para poder salvar a linha e trocar com outra linha do vetor		
		for (int col = 0; col < 10; col++) {
			linha2[col] = mat[1][col];	//salvar a linha no vetor
		}
		for (int col = 0; col < 10; col++) {
			linha8[col] = mat[7][col];	//salvar a linha no vetor
		}
		for (int col = 0; col < 10; col++) {
			mat[1][col] = linha8[col];	//trocar linha com vetor
		}
		for (int col = 0; col < 10; col++) {
			mat[7][col] = linha2[col];	//trocar linha com vetor
		}
	}

	public static void troca2(int[][] mat) {	//procedimento para trocar a coluna 4 com a coluna 10 da matriz e salvar ela global
		int[] coluna4 = new int[10];	//usei vetor para poder salvar a coluna e trocar com outra coluna do vetor	
		int[] coluna10 = new int[10];	//usei vetor para poder salvar a coluna e trocar com outra coluna do vetor	
		for (int ln = 0; ln < 10; ln++) {
			coluna4[ln] = mat[ln][3];	//salvar a coluna no vetor
		}
		for (int ln = 0; ln < 10; ln++) {
			coluna10[ln] = mat[ln][9];	//salvar a coluna no vetor
		}
		for (int ln = 0; ln < 10; ln++) {
			mat[ln][3] = coluna10[ln];	//trocar coluna com vetor
		}
		for (int ln = 0; ln < 10; ln++) {
			mat[ln][9] = coluna4[ln];	//trocar coluna com vetor
		}
	}

	public static void troca3(int[][] mat) {	////procedimento para trocar a diagonal principal com a diagonal secundaria da matriz e salvar ela global
		int[] diagonalprin = new int[10];	//usei vetor para poder salvar a diagonal principal e trocar com a diagonal secúndaria
		int[] diagonalsecu = new int[10];	//usei vetor para poder salvar a diagonal secúndaria e trocar com a diagonal principal
		int ln = 0;
		for (int col = 0; col < 10; col++) {
			diagonalprin[col] = mat[col][col];	//salvar diagonal principal em um vetor
		}
		ln = 0;
		for (int col = 9; col >= 0; col--) {
			diagonalsecu[ln] = mat[ln][col];	//salvar diagonal secúndaria em um vetor
			ln++;
		}
		ln = 0;
		for (int col = 0; col < 10; col++) {
			mat[col][col] = diagonalsecu[col];	//trocar diagonal principal com diagonal secúndaria
		}
		ln = 0;
		for (int col = 9; col >= 0; col--) {	//trocar diagonal secúndaria com diagonal principal
			mat[ln][col] = diagonalprin[ln];
			ln++;
		}
	}

	public static void troca4(int[][] mat) {	//procedimento para trocar a linha 5 com a coluna 10 da matriz e salvar ela global
		int[] linha5 = new int[10];		//usei vetor para poder salvar a linha e trocar com outra coluna do vetor	
		int[] coluna10 = new int[10];	//usei vetor para poder salvar a coluna e trocar com outra linha do vetor
		for (int coluna = 0; coluna < 10; coluna++) {
			linha5[coluna] = mat[4][coluna];	//salvar linha 5 no vetor
		}
		for (int linha = 0; linha < 10; linha++) {
			coluna10[linha] = mat[linha][9];	//salvar coluna 10 no vetor
		}
		for (int coluna = 0; coluna < 10; coluna++) {
			mat[4][coluna] = coluna10[coluna];	//trocar linha 5 com coluna 10
		}
		for (int linha = 0; linha < 10; linha++) {
			mat[linha][9] = linha5[linha];	//trocar coluna 10 com linha 5
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[][] mat = new int[10][10];
		preenc(mat);
		System.out.println("Primeira Matriz:");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca1(mat);
		System.out.println("Troca linha 2 com linha 8 ");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca2(mat);
		System.out.println("Troca coluna 4 com coluna 10");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca3(mat);
		System.out.println("Troca diagonal principal com diagonal secundaria");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca4(mat);
		System.out.println("Troca linha 5 com coluna 10");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		ent.close();
	}

}
