public class FirstLastDigitSum {
    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit = 0;

            while (number != 0) {
                firstDigit = number % 10;
                number /= 10;
            }

            int sum = lastDigit + firstDigit;
            return sum;
        }
    }
}
