import java.util.Scanner;
public class ComaBem {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double preco, conta;
		preco = ent.nextDouble();
		conta = preco + preco * 0.1;
		System.out.printf("%.2f", conta);

	}

}
