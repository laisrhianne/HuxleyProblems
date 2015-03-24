import java.util.Scanner;
public class IngressoCinema {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int estudante, idoso;
		estudante = ent.nextInt();
		idoso = ent.nextInt();
		if ((estudante == 1) || (idoso == 1)) {
			System.out.println("1");
		
		}
		else {
			System.out.println("0");
		}

	}

}
