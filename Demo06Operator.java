public class Demo06Operator {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		System.out.println("=============");
		int num2 = 20;
		System.out.println(++num2);
		System.out.println(num2);
		int num3 = 30;
		System.out.println(num3++);
		System.out.println(num3);
		int num4=40;
		int result1=--num4;//Ç°¼õ¼õ
		System.out.println(result1);
		System.out.println(num4);
		int num5=50;
		int result2=num5--;//ºó¼õ¼õ
		System.out.println(num5);
		System.out.println(result2);
		int x=10;
		int y=20;
		int result3=++x + y--;
		System.out.println(result3);
		System.out.println(x);
		System.out.println(y);
		
	}
}