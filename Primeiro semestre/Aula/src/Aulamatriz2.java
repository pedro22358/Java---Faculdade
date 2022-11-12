import java.util.Scanner;

public class Aulamatriz2 {
	public static void preencher(int[][]matriz) {
		Scanner ent = new Scanner(System.in);
		for(int ln=0;ln<matriz.length;ln++) {
			for(int col=0;col<matriz.length;col++) {
				System.out.printf("Digite [%d] [%d]:",ln,col);
				matriz [ln][col] = ent.nextInt();
			}
		}
	}
	public static void exibir(int[][] dados) {
		for(int i=0;i<dados.length;i++) {
			for(int j=0;j<dados[0].length;j++) {
				System.out.println(dados [i][j]+"");
			}
			System.out.println();
		}
	}
	public static int[] gerarDiag(int[][]mat) {
		int[]diag=new int[mat.length];
		for(int pos=0;pos<mat.length;pos++) {
			diag[pos]=mat[pos][pos];
		}
		return diag;
	}
	public static void main(String[] args) {
		int[][]numeros;
		int[]diagonal;
		int N;
		Scanner ent = new Scanner(System.in);
		System.out.println("Qual é o tamanho?");
		N=ent.nextInt();
		numeros=new int[N][N];
		diagonal=new int [N];
		preencher(numeros);
		exibir(numeros);
		diagonal=gerarDiag(numeros);
		for (int p=0;p<N;p++) {
			System.out.println(diagonal[p]);
		}
		ent.close();
	}

}
