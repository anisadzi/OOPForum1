import java.util.Scanner;

class No13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextDouble();

        System.out.print("Input b: ");
        double b = in.nextDouble();

        System.out.print("Input c: ");
        double c = in.nextDouble();

        double d = b*b - 4 * a * c;

        if (d < 0) {
            System.out.println("The equation has no real roots.");
        }
        else if (d == 0){
            double root1 = -b / (2*a);
            System.out.println("The equation has one root" + root1);
        }
        else {
            double rootplus = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double rootmin = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The equation has two roots: " + rootplus + " and " + rootmin);
        }

    }
}