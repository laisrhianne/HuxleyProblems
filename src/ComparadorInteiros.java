import java.util.Scanner;
public class ComparadorInteiros {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int valorx, valory;
		valorx = ent.nextInt();
		valory = ent.nextInt();
		if (valorx > valory) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		if (valorx == valory) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		if (valorx < valory) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		if (valorx != valory) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		if (valorx >= valory) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		if (valorx <= valory) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}

	}

}
