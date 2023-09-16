import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 100; i < 1000; i++){
            int firstDigit = i / 100;
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 10;
            if ((firstDigit + secondDigit + thirdDigit) == N){
                System.out.println(i);
            }
        }
    }
}