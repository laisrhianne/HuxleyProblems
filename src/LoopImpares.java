import java.util.Scanner;


public class LoopImpares {
	
	public static void nums(int num1, int num2, int numImp) {
		if (num1 % 2 == 1) {
			System.out.println(num1);
			while (numImp + 2 <= num2) {
				numImp = numImp + 2;
				System.out.println(numImp);;
			}
		}

		else if (num1 % 2 == 0) {
			numImp = numImp + 1;
			System.out.println(numImp);
			while (numImp + 2 <= num2) {
				numImp = numImp + 2;
				System.out.println(numImp);
			}
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num1, num2, numImp;
		num1 = ent.nextInt();
		num2 = ent.nextInt();
		numImp = num1;
		nums(num1, num2, numImp);

	}
}
