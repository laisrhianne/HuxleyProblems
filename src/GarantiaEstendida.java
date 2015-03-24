import java.util.Scanner;

public class GarantiaEstendida {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double preco, precofinal;
		int anos;
		preco = ent.nextDouble();
		anos = ent.nextInt();
		if (anos == 0) {
			precofinal = preco;
			System.out.printf("%.2f", precofinal);
		} 
		else if (anos == 1) {
			precofinal = preco + preco * 0.03;
			System.out.printf("%.2f", precofinal);
		} 
		else if (anos == 2) {
			precofinal = preco + preco * 0.05;
			System.out.printf("%.2f", precofinal);
		}
	}

}
