import java.util.Scanner;

public class Demo58ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input the first number");
        int a = sc.nextInt();
        System.out.println("please input the second number");
        int b = sc.nextInt();
        System.out.println("please input the third number");
        int c = sc.nextInt();
        int temp;
        if(a > b ){
            temp = a;
        }else {
            temp = b;
        }
        int max;
        if (temp > c){
            max = temp;
        } else {
            max = c;
        }
        System.out.println("the maximum value is " + max);
    }

}
