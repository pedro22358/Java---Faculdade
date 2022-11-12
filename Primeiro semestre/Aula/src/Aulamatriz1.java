import java.util.Scanner;

public class Aulamatriz1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int [][] tabela = new int [5][3];
		int [] maiores = new int [5];
		double [] medias = new double [3];
		for(int ln = 0; ln < 5; ln++) {
			for(int col = 0; col < 3; col++) {
				System.out.println("Elemento " + ln + " e " + col + " é :");
				tabela[ln][col] = ent.nextInt();
			}
		}
		for (int i = 0;i<tabela.length;i++) {
			maiores [i] = tabela[i][0];
			for (int j=1;j<tabela[0].length;j++) {
				if (tabela [i] [j] > maiores[i]) {
					maiores[i]=tabela[i][j];
				}
			}
		}
		for(int col = 0; col<tabela[0].length;col++) {
			medias [col]=0;
			for(int ln=0; ln<tabela.length;ln++) {
				medias[col] += tabela[ln][col];
			}
			medias [col]/=tabela.length;
		}
		System.out.println("Maiores");
		for(int pos=0;pos<tabela.length;pos++) {
			System.out.println(maiores[pos]+"");
		}
		for(int p=0;p<tabela[0].length;p++) {
			System.out.println(medias[p]+"");}
		ent.close();  
	}

}
