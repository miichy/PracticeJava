package JavaTutorials;

public class BasicString {

	public static void main(String[] args) {
		String str = "abc";
		byte[] bs = str.getBytes();
		System.out.println(bs[1]);
		byte b = bs[2];
		System.out.println(b);
		System.out.println(Byte.valueOf(b));
	}

}
