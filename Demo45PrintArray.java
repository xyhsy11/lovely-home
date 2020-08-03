import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Arrays;
public class Demo45PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 49, 50};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
