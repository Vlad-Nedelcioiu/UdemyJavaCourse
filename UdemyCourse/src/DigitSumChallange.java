public class DigitSumChallange {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int lastDigit = 0;
        if (number > 0) {
            for (int i = 1; i <= 10; i++) {
                lastDigit = number % 10;
                number = number / 10;
                sum += lastDigit;
            }
            return sum;
        } else
            return -1;
    }
}
