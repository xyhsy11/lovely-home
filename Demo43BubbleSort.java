public class Demo43BubbleSort {
	public static void main(String[] args) {
		int[] array1 = { 24 , 69 , 74 , 23 , 49 , 46 , 41 , 492 , 8532 , 41};
		printArray(array1);
		System.out.println("ÅÅĞòÇ°=====");
		
		bubble3(array1);
		System.out.println("ÅÅĞòºó=====");
		printArray(array1);
		
		//bubble1(array1);
		
		//printArray(array1);
		
			
		//bubble2(array1);
		
		//printArray(array1);
	}
	public static void printArray(int[] array){
		System.out.print("[");
		for(int i = 0, j = array.length; i < j; i++){
			if(i == j - 1) {
				System.out.print(array[i]);
			} else{
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println("]");
	}
	public static void bubble(int[] array){
		for(int i = 0, j = array.length - 1-0; i < j; i++) {
			if(array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}
	
	public static void bubble1(int[] array){
		for(int i = 0, j = array.length - 1-1; i < j; i++) {
			if(array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}
	
		public static void bubble2(int[] array){
		for(int i = 0 , j = array.length - 1-2; i < j; i++) {
			if(array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}
	public static void bubble3(int[] array){
		for(int a = 0, j = array.length; a < j - 1; a++){
			for(int i = 0; i < j - 1 - a; i++){
				if(array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}
}
}