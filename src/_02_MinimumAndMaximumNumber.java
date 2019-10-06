import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _02_MinimumAndMaximumNumber {

    public static void main(String[] args) {

System.out.println("Enter Up To 5 Numbers");
    Scanner scanner=new Scanner(System.in);
    Integer[] numbers =new Integer[5];

    for (int i=0; i<numbers.length; i++)
    {  System.out.print("enter numbers ["+ i +"]:");
       numbers[i]=scanner.nextInt();
    }
    int minimum = (int) Collections.min(Arrays.asList(numbers));
    int maximum = (int) Collections.max(Arrays.asList(numbers));

    System.out.println("Minimum number: " + minimum);
    System.out.println("Maximum number: " + maximum);
    }
}
