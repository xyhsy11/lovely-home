public class Demo40ArrayOne {
	public static void main(String[] args) {
		int[] array = new int[3];
		System.out.println(array);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println("=======");
		array[1] = 10;
		array[2] = 20;
		System.out.println(array);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
}