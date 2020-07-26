public class Demo37NarcissisticNumber {
	public static void main(String[] args) {
		narcissistic(999);
	}
	public static void narcissistic(int a) {
		System.out.println("水仙花数为");
		for (int i = 100; i < a; i++) {
			int b = i % 10;
			int c = i / 100;
			int d = ((i % 100) - b) / 10;
			if (i == b * b * b + c * c * c + d * d * d) {
				System.out.print(i + " ");
			}
		}
	}
}