public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int numberCheck = number;
        int sum = 0;
        for (int factor = 1; factor < number; factor++) {
            if (number % factor == 0) {
                sum += factor;
            }
        }
        if (sum == numberCheck) {
            return true;
        } else
            return false;
    }
}