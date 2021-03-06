package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 1000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3.0);

		Float f = 1003.32F;
		System.out.println(f);

		Double d = 10002.3;
		System.out.println(d);

		Boolean bool = Boolean.parseBoolean("true");
		System.out.println(bool);
		System.out.println(bool.toString().toUpperCase());

		Character c = '#'; // char
		System.out.println(c.toString());
	}
}
