import java.util.Scanner;

public class Segundos {
	static void getHorario (int seg, int min, int hr) {
		while (seg >= 60) {
		seg = seg%60;
		}
		
		System.out.println( hr + " h " + min + " m " + seg + " s");
		
		
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int seg, min, hr;
		seg = ent.nextInt();
		min = seg/60;
		hr = min/60;
		
		while (min>=60) {
			min = min%60;
			}
		getHorario(seg, min, hr);

	}

}
