import java.util.Scanner;
public class EnchendoTanque {

	public static void main(String[] args) {
		Scanner ent =new Scanner (System.in);
		double litros, valor;
		litros = ent.nextDouble();
		valor = (50 - litros) * 2.78;
		System.out.printf("%.2f", valor);

	}

}
