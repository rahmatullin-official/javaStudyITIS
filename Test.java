import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
       int [] arr = new int[75];
       int [] y = new int[75];
       int counter = 0;
       for (int i = 0; i < 75; i++){
           double rand = Math.random() * 45 - 5;
           arr[i] = (int)rand;
           if (arr[i] < 20) {
               y[counter] = arr[i];
               counter += 1;
           }
       }
       for(int i = 0; i < 75; i++){
           System.out.print(y[i] + " ");
       }
    }
}