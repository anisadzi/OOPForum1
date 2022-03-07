import java.util.Scanner;

class No9 {
    public static void main(String[] args) {
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius: ");

        float c = inputTemp.nextFloat();
        float f = (c / 5 * 9) + 32;

        System.out.println(c + " Celcius degrees are " + f + " Fahrenheit degrees.");
    }
}