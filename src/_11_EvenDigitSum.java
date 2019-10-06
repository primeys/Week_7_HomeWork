import java.util.Scanner;

public class _11_EvenDigitSum {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to find out your even number sum :");
        int number = scanner.nextInt();
        getEvenDigitSum(number);
    }
    public static void getEvenDigitSum(int number)
    {
        int reminder=0;
        int sum=0;
        while (number>0)
        {
            reminder = number %10;
            if (reminder%2 ==0)
            {
                sum = sum +reminder;
            }
            number = number /10;
        }

        System.out.println(" Enter numbers sum:" +sum);
    }

}
