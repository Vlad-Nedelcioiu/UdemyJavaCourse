public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(224562));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int evenDigit = 0;
        while (number > 0) {
            evenDigit = number % 10;
            number = number / 10;
            if (evenDigit % 2 == 0) {
                sum += evenDigit;
            }
        }
        return sum;
    }
}
