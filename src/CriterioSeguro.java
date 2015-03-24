import java.util.Scanner;

public class CriterioSeguro {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int genero, idade;
		genero = ent.nextInt();
		idade = ent.nextInt();
		if ((genero == 0) && (idade == 1)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
