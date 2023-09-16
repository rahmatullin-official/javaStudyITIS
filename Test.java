import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
        int[] s = new int[26];
        int[][] matrix = new int[2][13];

        for (int i = 0; i < 26; i++){
            int rand = (int) (Math.random() * 100);
            s[i] = rand;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 13; j++) {
                matrix[i][j] = s[i + j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 13; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}