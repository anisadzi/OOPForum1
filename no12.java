class No12 {
    public static void main(String[] args) {
        int number;
        int square;
        int cube;

        System.out.println("Number \t Square \t Cube");

        for (number = 1; number < 11; number ++) {
            square = number * number;
            cube = number * square;
            System.out.println("\t" + number + "\t\t" + square + "\t\t" + cube);
        }
    }
}