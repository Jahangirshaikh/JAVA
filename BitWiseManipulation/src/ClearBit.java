
public class ClearBit {
	public static void main(String[] args) {
		//Clear the 3rd bit position of given number
		int n = 5;
		int pos = 2;
		int bitMask = 1<<pos;
		int notBitMask = ~(bitMask);
		int number = notBitMask & n;
		System.out.println(number);
	}
}
