public class Demo42ArrayMax {
	public static void main(String[] args) {
		int[] array = { 2 ,3 ,8 ,20 ,1 , 25};
		int max = array[0];
		for (int i = 1,j = array.length; i < j; i++) {
			if (array[i] > max){
				max = array[i];
			}
		}
		System.out.println("max is " + max);
	}
}