import java.util.Scanner;

public class LancheEscoteiros {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int quantidade;
		double preco;
		quantidade = ent.nextInt();
		preco = quantidade * (2 * (4.15) / 23) + quantidade * (3.89) / 8;
		System.out.printf("%.2f", preco);

	}

}
