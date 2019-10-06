import java.util.Scanner;

public class _17_AverageValueOfArray {

    public static void main(String[] args) {

    System.out.println("How many numbers do you want to enter?");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    double[] arry = new double[x];
    double total = 0;
        for(int i=0; i < arry.length ; i++){
        System.out.print("Enter Element No."+ (i+1) +": ");
        arry [i] = scanner.nextDouble();
    }
        scanner.close();
        for(int i=0; i<arry.length; i++)
        {
        total = total + arry[i];
        }
        double average = total / arry.length;
        System.out.format("The average is: %3f", average);
    }

}
