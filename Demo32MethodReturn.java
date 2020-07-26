public class Demo32MethodReturn {
	public static void main(String[] args) {
		//int num = sum(10, 20);
		//printsum(20,30);
		//boolean flag = compare (2, 2);
		//System.out.println(flag);
		//int max = max(2, 2);
		//System.out.println(max);
		//System.out.println(sum(50));
		printRes(5,6);
	}
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	public static void printsum(int a, int b) {
		int result = a + b;
		System.out.println("½á¹ûÊÇ£º" + result);
	}
	public static boolean compare(int a, int b) {
		if(a == b) {
			return true;
		} else {
			return false;
		}
	}
	public static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
	public static int sum(int a) {
		int sum = 0;
		for (int i = 1;i <= a; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		return sum;
	}
	public static void printRes(int a, int b) {
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < b; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}