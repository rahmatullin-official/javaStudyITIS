import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
       int [] arr = new int[100];
       int N = 2;
       for(int i = 0; i < 100; i++){
           if (i % 2 == 0){
                arr[i] = N;
           }
           else{
               arr[i] = N - 1;
               N += 2;
           }
       }
        for(int i = 0; i < 100; i++){
            System.out.print(arr[i] + " ");
        }

    }
}