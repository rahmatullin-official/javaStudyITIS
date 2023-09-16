import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++){

            int fourthDigit = i % 10;
            int thirdDigit = i % 100 / 10;
            int secondDigit = i % 1000 / 100;
            int firstDigit = i / 1000;

            if (i % 2 == 0 && i % 7 == 0 && i % 11 == 0){
                if ((fourthDigit + thirdDigit + secondDigit + firstDigit) == 30){
                    if ((firstDigit == secondDigit && thirdDigit == fourthDigit)
                            || (firstDigit == thirdDigit && secondDigit == fourthDigit)
                            || (firstDigit ==fourthDigit && secondDigit == thirdDigit)) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}