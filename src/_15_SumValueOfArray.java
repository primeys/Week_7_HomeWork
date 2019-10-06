import java.util.Scanner;

public class _15_SumValueOfArray
{

    public static void main(String[] args)
    {
        {
            int x, sum = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Array length, you want in array:");

            x = scanner.nextInt();
            int y[] = new int[x];

            System.out.println("Enter your number one by one to the sum:");

            for(int i = 0; i < x; i++)
            {
                y[i] = scanner.nextInt();
                sum = sum + y[i];
            }
            System.out.println("Total Sum of all number is : " +sum);
        }



    }

}
