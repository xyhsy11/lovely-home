import java.util.Scanner;

/*
A�� ����
	��ʽ
	import java.util.Scanner;
	λ��
	��class����
B�� ��������¼�����
	��ʽ
	scanner sc = new Scanner (System.in);
C:  ͨ�������ȡ����
	��ʽ
	int x = sc. nextInt();
*/
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������һ������");
		int x = sc.nextInt();
		
		System.out.println("�������������" + x);
		
	}
}