public class LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)) {
            if ((firstNumber % 10) == (secondNumber % 10) || (firstNumber % 10) == (thirdNumber % 10)
                    || (thirdNumber % 10) == (secondNumber % 10)) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    public static boolean isValid(int parameter) {
        if (parameter < 10 || parameter > 1000) {
            return false;
        } else
            return true;
    }
}
