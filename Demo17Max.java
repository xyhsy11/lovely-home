public class Demo17Max {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//ÈýÔªÔËËã·û
		//int max = a > b ? a : b;
		
		//if
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("Max: " + max);
	}
}