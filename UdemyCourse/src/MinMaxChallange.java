import java.util.Scanner;

public class MinMaxChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopIteration = 0;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                double validNumber = Double.parseDouble(scanner.nextLine());
                if (loopIteration == 0 || validNumber < min) {
                    min = validNumber;
                }
                if (loopIteration == 0 || validNumber > max) {
                    max = validNumber;
                }
            } catch (NumberFormatException fde) {
                break;
            }
            loopIteration++;
        }

        if (loopIteration == 0) {
            System.out.println("No valid data was entered");
        } else {
            System.out.println("min = " + min + " and max = " + max);
        }
    }
}
