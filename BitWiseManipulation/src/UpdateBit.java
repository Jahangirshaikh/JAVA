import java.util.Scanner;

public class UpdateBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		int n = 5;
		int pos = 1;
		int bitmask = 1<<pos;
		
		if(op == 1) {
			//set
			int number = bitmask | n;
			System.out.println(number);
		}
		else if(op == 0) {
			//clear
			int notBitMask = ~(bitmask);
			int number = notBitMask & n;
			System.out.println(number);
		}
		else {
			System.out.println("Invalid Operation");
		}
	}
}
