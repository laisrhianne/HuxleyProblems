import java.util.Scanner;
public class quantosminutos {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a, b;
		a = ent.nextInt();
		b = ent.nextInt();
		
		int total = 60*a + b;
		System.out.println(total + " minutos.");

	}

}
