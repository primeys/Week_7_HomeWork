import java.util.Scanner;

public class _07_FirstAndLastDig_Sum {
    public static void main(String[] args) {
        System.out.println("Enter any number to find First and last Digit Sum: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        sumFirstAndLastDigit(number);
    }
    public static int sumFirstAndLastDigit(int number) {
        int num = number;
        if (num < 0) { return -1;}
        int lastDigit = num % 10;
        while (num >= 10) {num = number / 10;}
        int firstDigit = num;
        System.out.println("Enter number sum is" + (firstDigit + lastDigit));
        return num;
    }
}
