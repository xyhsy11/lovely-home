/*
1. ���case�������ֵ�����ظ�
*/
public class Demo19SwitchNotice {
	public static void main(String[] args) {
		int num = 1;
		switch (num) {
			case 2:
				System.out.println("Hello to myself");
				break;
			case 3:
				System.out.println("Hello to you and me");
			case 1:
				System.out.println("Hello");
				break;
			default:
			    System.out.println("Hello to everybody");
				break;
		}
	}
}