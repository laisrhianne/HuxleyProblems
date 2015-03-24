import java.util.Scanner;

public class FormatandoEndereco {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String rua, residencia, bairro, cidade, estado, cep;
		
		rua = ent.nextLine();
		residencia = ent.nextLine();
		bairro = ent.nextLine();
		cidade = ent.nextLine();
		estado = ent.nextLine();
		cep = ent.nextLine();
		System.out.print(rua + ", " + residencia + "." + "\n");
		System.out.print("Bairro: " + bairro + ". Cep: " + cep + "\n");
		System.out.print(cidade + "/" + estado + "\n");

	}

}
