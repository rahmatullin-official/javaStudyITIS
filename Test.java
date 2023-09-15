import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int someDigit = scan.nextInt();

        // First task (4)

        System.out.println("First task: ");
        double z1 = (Math.sin(someDigit * 2) + Math.sin(someDigit * 5) - Math.sin(someDigit * 3)) /
                (Math.cos(someDigit) - Math.cos(3 * someDigit) + Math.cos(someDigit * 5));
        double z2 = Math.tan(3 * someDigit);

        System.out.printf("Answer: " + "%.3f " + "%.3f \n", z1, z2);

        // Second Task (4)

        System.out.println("Second task: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = scan.nextInt();
        double y = 0;

        if (Math.abs(a * a - b * b) > b) {
            y = Math.pow(a, x / 2) - Math.pow(Math.E, Math.cos(x));
        } else {
            if (Math.abs(a * a - b * b) <= b) {
                y = Math.tan(4 * x) - a;
            }
        }
        System.out.println("Answer: " + y);

        // Second Task (4)

        System.out.println("Third task: ");
        int yearDate = scan.nextInt();
        int yearLoop = 12;

        int ratYear = 1996;
        int cowYear = 1997;
        int tigerYear = 1998;

        int rabbitYear = 1999;
        int dragonYear = 2000;
        int snakeYear = 2001;

        int horseYear = 2002;
        int sheepYear = 2003;
        int monkeyYear = 2004;

        int roosterYear = 2005;
        int dogYear = 2006;
        int pigYear = 2007;

        System.out.print("Answer: ");
        if ((yearDate - ratYear) % yearLoop == 0) {
            System.out.println("rat year");
        } else if ((yearDate - cowYear) % yearLoop == 0) {
            System.out.println("cow year");
        } else if ((yearDate - tigerYear) % yearLoop == 0) {
            System.out.println("tiger year");
        } else if ((yearDate - rabbitYear) % yearLoop == 0) {
            System.out.println("rabbit year");
        } else if ((yearDate - dragonYear) % yearLoop == 0) {
            System.out.println("dragon year");
        } else if ((yearDate - snakeYear) % yearLoop == 0) {
            System.out.println("snake year");
        } else if ((yearDate - horseYear) % yearLoop == 0) {
            System.out.println("horse year");
        } else if ((yearDate - sheepYear) % yearLoop == 0) {
            System.out.println("sheep year");
        } else if ((yearDate - monkeyYear) % yearLoop == 0) {
            System.out.println("monkey year");
        } else if ((yearDate - roosterYear) % yearLoop == 0) {
            System.out.println("rooster year");
        } else if ((yearDate - dogYear) % yearLoop == 0) {
            System.out.println("dog year");
        } else if ((yearDate - pigYear) % yearLoop == 0) {
            System.out.println("pig year");
        }
    }
}