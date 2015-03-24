import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {
		double time, speed, km;
		Scanner ent = new Scanner(System.in);
		time = ent.nextInt();
		speed = ent.nextInt();
		km = (time * speed) / 12;
		System.out.printf("%.3f", km);
	}

}
