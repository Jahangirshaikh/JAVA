public class GetBit {
		public static void main(String[] args) {
				//Get the 3rd bit (position 2) of a number n
				//Bitmask 1<<1 
				//Operation AND
			int n = 5;
			int pos = 2;
			int bitMask = 1<<pos;
			
			if((bitMask & n) == 0) {
				System.out.println("bit was zero");
			}
			else {
				System.out.println("bit was non-zero");
			}
		}
}
