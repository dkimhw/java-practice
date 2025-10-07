public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegativeZero.checkNumber(0);
        PositiveNegativeZero.checkNumber(5);
        PositiveNegativeZero.checkNumber(-5);
    }
}
