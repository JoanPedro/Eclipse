package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double ADJUSTS = 32;
		final double FACTOR = (5.0/9.0);
		double fh = 86;
		
		double C = (fh - ADJUSTS) * FACTOR;
		System.out.println(C);

		fh = 100;
		
		C = (fh - ADJUSTS) * FACTOR;
		System.out.println(C);
	}
}
