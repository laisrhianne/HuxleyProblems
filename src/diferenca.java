import java.util.Scanner;
public class diferenca {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a, b, c, d, f;
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		d = ent.nextInt();
		
		f = a*b - (c*d);
		
		System.out.println("DIFERENCA = " + f);
		

	}

}
