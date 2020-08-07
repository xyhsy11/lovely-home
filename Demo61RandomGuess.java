import java.util.Random;
import java.util.Scanner;
public class Demo61RandomGuess {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

       while(true){
           System.out.println("please input the number you guess");
           int guessNumber = sc.nextInt();
           if (guessNumber > a){
               System.out.println("The number you guess is too large, please try again");
           } else if (guessNumber < a) {
               System.out.println("The number you guess is too small, please try again");
           } else{
               System.out.println("you have got the right number");
               break;
           }

       }
        System.out.println("Congratulation,you passed the game");
    }
}
