public class Demo24LoopDifference {
	public static void main(String[] args) {
		for (int i = 1; i < 0; i++){
			System.out.println("Hello");
		}	
			
			
		int i = 1;
		do {
			System.out.println("World");
			i++;
		} while (i < 0);
	}
}