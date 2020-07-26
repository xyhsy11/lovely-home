public class Demo31MethodParam {
	public static void main(String[] args){
	method1(10, 100);	
	method2();
	}
	public static void method1(int a, int b) {
		int result = a * b;
		System.out.println("½á¹ûÊÇ£º" + result);
	}
	public static void method2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I love JAVA!" + i);
		}
	}
}