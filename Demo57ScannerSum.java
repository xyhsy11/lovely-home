import java.util.Scanner;

public class Demo57ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input the first number");
        int a = sc.nextInt();
        System.out.println("please input the second number");

        int b = sc.nextInt();
        int result = a + b;
        System.out.println("the result is  " + result);
    }
}
