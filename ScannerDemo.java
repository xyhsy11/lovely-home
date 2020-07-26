/*
A： 导包
	格式
	import java.util.Scanner;
	位置
	在class上面
B： 创建键盘录入对象
	格式
	scanner sc = new Scanner (System.in);
C:  通过对象获取数据
	格式
	int x = sc. nextInt();
*/
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请你输入一个数据");
		int x = sc.nextInt();
		
		System.out.println("你输入的数据是" + x);
		
	}
}