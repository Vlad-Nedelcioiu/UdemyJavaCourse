public class SharedDigit {
    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int firstDigitFirstNumber = firstNumber / 10;
        int lastDigitFirstNumber = firstNumber % 10;
        int firstDigitSecondNumber = secondNumber / 10;
        int lastDigitSecondNumber = secondNumber % 10;

        if ((firstDigitFirstNumber == firstDigitSecondNumber) || (firstDigitFirstNumber == lastDigitSecondNumber)) {
            return true;
        } else if ((lastDigitFirstNumber == firstDigitSecondNumber)
                || (lastDigitFirstNumber == lastDigitSecondNumber)) {
            return true;
        } else
            return false;

    }
}
