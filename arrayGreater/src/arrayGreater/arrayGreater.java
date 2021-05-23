package arrayGreater;

public class arrayGreater {

	public static void main(String[] args) {

		int a[] = { 5, 8, 45, 65, 23, -23, 64 };
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = addition(total, a[i]);
		}
		System.out.println(total);
	}

	public static int addition(int x, int y) {
		return x + y;
	}
}