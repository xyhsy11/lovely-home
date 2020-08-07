import java.util.Random;

public class Demo60RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 5;
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println("result is " + result);
        }
    }
}
