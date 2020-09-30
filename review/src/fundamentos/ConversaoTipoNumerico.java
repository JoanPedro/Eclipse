package fundamentos;

public class ConversaoTipoNumerico {
	public static void main(String[] args) {

		double a = 1; // Implicit
		System.out.println(a);

		float b = (float) 1.2345; // Explicit (Cast)
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // Explicit (Cast)
		System.out.println(d);

		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);

	}
}
