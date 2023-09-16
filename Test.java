import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
       int [] arr = new int[100];
       int start = 1;
       int end = 100;
       for(int i = 0; i < 100; i++){
           if (i % 2 == 0){
                arr[i] = start;
                start++;
           }
           else{
                arr[i] = end;
                end--;
           }
       }
        for(int i = 0; i < 100; i++){
            System.out.print(arr[i] + " ");
        }

    }
}