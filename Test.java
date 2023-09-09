import java.util.Scanner;
import java.lang.Math;

public class Test {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		int n = scan.nextInt();
		double res_a, res_b, res_c;
		
		res_a = Math.sqrt(((x + y) / (Math.log10(x * x))) * n);
		res_b = Math.pow(Math.E, - (Math.abs(y))) + 1 / (x * x * Math.sqrt(n));	 
		res_c = Math.atan(x/n) + Math.abs(Math.pow(x,3) * Math.sqrt(n * y));
		
		System.out.printf("res_a = %s\nres_b = %s\nres_c = %s\n", res_a,res_b,res_c);
	}
}