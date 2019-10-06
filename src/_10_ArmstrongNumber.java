import java.util.Scanner;

public class _10_ArmstrongNumber
{
    public static void main(String[] args)
    {
        _10_ArmstrongNumber arm = new _10_ArmstrongNumber();
        arm.ArmstrongNumber();
    }

    public void ArmstrongNumber(){
        int y =0;
        int b,  d, x, f;

            Scanner scanner  = new Scanner(System.in);
            System.out.print("Enter The Number To Check Its ArmStrong Number : ");

            int a  = scanner.nextInt();
            x = a;
            while( a > 0)
            {
                b = a % 10;
                a = a / 10;
                y = y+(b*b*b);
            }
            if(y == x){
                System.out.println("Number is Armstrong ");
            }
            else {
                System.out.println("Number is not Armstrong  ");
        }
    }
}


