package uebung3;

public class WurzelDebuggen {

	public static void main(String[] args) {
		int n = 4;
		int sqr = 0;
		int result = 0;
		for (; result < n; sqr++) {
			result = sqr * sqr;
		}
		if (result == n) {
			System.out.println("Die Wurzel aus " + n + " ist " + sqr);
		} else {
			System.out.println("Keine Wurzel für " + n + " gefunden.");
			System.out.println("Die nächst größere Zahl mit einer Wurzel " + "in den natürlichen Zahlen ist " + result
					+ " die Wurzel ist " + sqr);
		}
	}
}
