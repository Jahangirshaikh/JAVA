
public class SetBit {
	public static void main(String[] args) {
		//Set the 2nd bit of given n = 0101
		int n = 5;
		int pos = 1;
		int bitMask = 1<<pos;
		int number = bitMask | n;
		System.out.println(number);
	}
}
