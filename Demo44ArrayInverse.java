public class Demo44ArrayInverse {
	public static void main(String[] args) {
		int[] array = { 1 , 3 , 4 , 92 , 4 , 13 };
		printArray(array);
		inverse(array);
		printArray(array);
	}
	public static void printArray(int[] array) {
                System.out.print("[");
                for (int i = 0; i < array.length; i++) {
                        if (i == array.length - 1) {
                                System.out.print(array[i]);
                        } else {
                                System.out.print(array[i] + " ,");
                        }
                }
                System.out.println("]");
        }
		public static void inverse(int[] array){
			for(int a = 0, j = (array.length)/2; a < j; a++){
				for(int i = 0; i < j; i++){
					int temp = array[i];
					array[i] = array[2 * j - 1 - i];
					array[2 * j - 1 - i] = temp;
					
				}
			}
		}
}