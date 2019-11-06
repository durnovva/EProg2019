
public class While {

	public static void main(String[] args) {
		int m = 0;
		int n = 123456789;

		while (n != 0) {
		    m = (10 * m) + (n % 10);
		    n = n / 10;
		}
		
		System.out.println("m=" + m + " n=" + n);
	}

}
