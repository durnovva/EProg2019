import java.util.Scanner;

public class Sortieren {
	public static void main(String[] args) {
		int a, b, c;

		Scanner console = new Scanner(System.in);

		System.out.print("Geben Sie Zahl 1, 2 und 3 ein: ");
		a = console.nextInt();
		b = console.nextInt();
		c = console.nextInt();

		linear(a, b, c);
		decisionTree(a, b, c);
		subproblem(a, b, c);
		swapping(a, b, c);
	}

	/* Drucke 3 Zahlen. */
	public static void printThree(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}

	/*
	 * Drucke 3 Zahlen in aufsteigender Reihenfolge.
	 * 
	 * Methode: Überprüfe alle möglichen Kombinationen
	 */
	public static void linear(int a, int b, int c) {
		if (a <= b && b <= c) {
			printThree(a, b, c);
		} else if (a <= c && c <= b) {
			printThree(a, c, b);
		} else if (b <= c && c <= a) {
			printThree(b, c, a);
		} else if (b <= a && a <= c) {
			printThree(b, a, c);
		} else if (c <= a && a <= b) {
			printThree(c, a, b);
		} else if (c <= b && b <= a) {
			printThree(c, b, a);
		}
	}

	/* Drucke 3 Zahlen in aufsteigender Reihenfolge.
	 * 
	 * Methode: Entscheidungsbaum */
	public static void decisionTree(int a, int b, int c) {
		if (a > b && a > c) {
	        if (b > c) {
	        	printThree(c, b, a);
	        } else {
	        	printThree(b, c, a);
	        }
	    } else if (b > a && b > c) {
	        if (a > c) {
	        	printThree(c, a, b);
	        } else {
	        	printThree(a, c, b);
	        }
	    } else { // (c > a && c > b)
	        if (a > b) {
	        	printThree(b, a, c);
	        } else {
	        	printThree(a, b, c);
	        }
	    }
	}

	/* Drucke 3 Zahlen in aufsteigender Reihenfolge.
	 * 
	 * Methode: Finde Minimum, benutze printTwoSorted für den Rest
	 */
	public static void subproblem(int a, int b, int c) {
		/* Finde kleinste Zahl, sortiere die restlichen */
		if (a < b && a < c) {
			// a is smallest
			System.out.print(a + " ");
			printTwoSorted(b, c);
		} else if (b < a && b < c) {
			// b is smallest
			System.out.print(b + " ");
			printTwoSorted(a, c);
		} else {
			// c is smallest
			System.out.print(c + " ");
			printTwoSorted(a, b);
		}
	}

	/* Drucke zwei Zahlen in aufsteigender Reihenfolge */
	public static void printTwoSorted(int a, int b) {
		if (a <= b) {
			System.out.println(a + " " + b);
		} else { // b < a
			System.out.println(b + " " + a);
		}
	}

	/* Drucke 3 Zahlen in aufsteigender Reihenfolge.
	 * 
	 * Methode: Tausche die Zahlen paarweise bis sie am richtigen Platz sind
	 */
	public static void swapping(int a, int b, int c) {
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		printThree(a, b, c);
	}
}
