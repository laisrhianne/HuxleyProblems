import java.util.Scanner;

public class mediaalunos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double a,b,c; 
		
		a = entrada.nextDouble();
		
		b = entrada.nextDouble();
		
		c = entrada.nextDouble();
		
		double x = ((a+b+c)/3);
		
		if (x >= 7)
			System.out.println("aprovado");
		if (x < 3)
			System.out.println("reprovado");
		if ((3 <= x) && (x < 7))
			System.out.println("prova final");

	}

}
