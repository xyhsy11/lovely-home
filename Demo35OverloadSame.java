public class Demo35OverloadSame {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		System.out.println(isSame(a, b));
	}
	public static boolean isSame(byte a, byte b) {
		boolean same;
		System.out.println("两个byte参数的方法执行！");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(long a, long b) {
		boolean same;
		System.out.println("两个long参数的方法执行！");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(int a, int b) {
		boolean same;
		System.out.println("两个int参数的方法执行！");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(short a, short b) {
		boolean same;
		System.out.println("两个short参数的方法执行！");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
}