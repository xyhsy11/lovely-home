import java.util.Random;
public class Demo59Random {
    public static void main(String[] args) {
        Random r = new Random();
        //int num = r.nextInt();
        //System.out.println("the random number is " + num);
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
