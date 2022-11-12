import java.util.Scanner;
public class Exercicio3 {
	public static void menu(int as, int espaco) {
		if (as==1) {
			for (int i=1;i<=(espaco-as);i++) {
				System.out.print("_");
			}
			System.out.println("*");
		}
		
		else { menu(as-1, espaco);
			for (int i=1;i<=(espaco-as);i++) {
				System.out.print("_");
			}
			
			for (int i=1;i<=as;i++) {
			System.out.print("*");}
			System.out.println();
			}
		}
	// 1 art 3 espaos    2art     2 espacos     3    1 espaco   4ats 0 espaco

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int as;
		System.out.println("Digite o número de linhas:");
		as = ent.nextInt();
		int espaco= as;
		menu(as, espaco);
		ent.close();
	}

}
