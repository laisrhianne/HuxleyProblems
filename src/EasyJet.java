import java.util.Scanner;
public class EasyJet {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double largura, comprimento, altura;
		largura = ent.nextDouble();
		comprimento = ent.nextDouble();
		altura = ent.nextDouble();
		
		if ((largura <= 45) && (comprimento <= 56) && (altura <= 25)) {
			System.out.println("PERMITIDA");
		}
		else {
			System.out.println("PROIBIDA");
		}

	}

}
