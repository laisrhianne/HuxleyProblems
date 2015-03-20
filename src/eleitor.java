import java.util.Scanner;
public class eleitor {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int idade;
		idade = ent.nextInt();
		if (idade<16)
			System.out.println("nao eleitor");
		else if ((idade>=18) && (idade<=65))
			System.out.println("eleitor obrigatorio");
		else if (idade>65)
			System.out.println("eleitor facultativo");
		else if ((idade>=16) && (idade<18))
			System.out.println("eleitor facultativo");
		

	}

}
