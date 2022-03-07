import java.util.Scanner;

class No14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = in.nextInt();
        int sec = seconds % 60;
        int hour = seconds / 60;
        int min = hour % 60;
        hour = hour / 60;

        System.out.print(seconds + " seconds are " + hour + " hour, " + min + " minute, and " + sec + " seconds" );
    }
}