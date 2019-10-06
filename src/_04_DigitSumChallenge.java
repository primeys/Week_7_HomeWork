import java.util.Scanner;


public class _04_DigitSumChallenge
{
     static int i;
    public static void main(String[] args) {
        int Value = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            Value = sumDigi(num);
        }
        else {
            System.out.println(" Wrong Entry");
            return;
        }
        if (Value > 0) {
            System.out.println(" Sum is :" + i );
        }else {
            System.out.println("Wrong Entry");
        }
    }
    static int sumDigi(int number){
        if((number>=0 && number<10) || (number > 'a' && number < 'z')){
            return -1;
        }
        else if(number>=10) {
            while (number > 0) {
                int rem = number % 10;
                number = number / 10;
                i = i + rem;
            }
        }
        else{
            return -1;
        }
        return i;
    }
}
