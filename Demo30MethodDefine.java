public class Demo30MethodDefine {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int number = sum(10, 20);
		System.out.println(number);
	}
	public static int sum(int d, int e) {
		int result = d + e;
		return result;
	}
}