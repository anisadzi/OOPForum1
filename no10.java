import java.util.Scanner;
import java.lang.Math;

class No10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x1: ");
        int x1 = in.nextInt();

        System.out.print("Input x2: ");
        int x2 = in.nextInt();

        System.out.print("Input x3: ");
        int x3 = in.nextInt();

        double mean = (x1 + x2 + x3) / 3;
        double variance = (Math.pow ((x1 - mean), 2) + Math.pow ((x2 - mean), 2) + Math.pow ((x3 - mean), 2)) / 3;
        double stdeviation = (Math.sqrt(variance));

        System.out.println("Mean of " + x1 + " " + x2 + " " + x3 + " is " + mean);

        System.out.println("Variance of " + x1 + " " + x2 + " " + x3 + " is " + variance);

        System.out.println("Standard Deviation of " + x1 + " " + x2 + " " + x3 + " is " + stdeviation);
    }
}