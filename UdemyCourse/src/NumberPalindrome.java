public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number) {
        int initialNumber = number;
        int reverse = 0;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            reverse = reverse * 10;
            reverse += lastDigit;

        }

        if (initialNumber == reverse) {
            return true;
        } else
            return false;
    }
}
