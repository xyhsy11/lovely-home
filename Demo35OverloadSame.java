public class Demo35OverloadSame {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		System.out.println(isSame(a, b));
	}
	public static boolean isSame(byte a, byte b) {
		boolean same;
		System.out.println("����byte�����ķ���ִ�У�");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(long a, long b) {
		boolean same;
		System.out.println("����long�����ķ���ִ�У�");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(int a, int b) {
		boolean same;
		System.out.println("����int�����ķ���ִ�У�");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(short a, short b) {
		boolean same;
		System.out.println("����short�����ķ���ִ�У�");
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
}