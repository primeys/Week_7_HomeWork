import java.util.Scanner;

public class _05_PalindromeNumber {

public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
//    int i;
    System.out.print("\t Enter any number and find it is Palindrome or not:");
    int i = sc.nextInt();

    System.out.println(isPalindrome(i));
}

public static boolean isPalindrome(int number)
    {
        boolean ch = true;
        int reverse = 0,rem;

        int temp = number;

       while(temp != 0){
           rem = temp % 10;
           reverse = reverse * 10 +rem;
           temp = temp / 10;
       }
       if (number == reverse)
       {
           ch = true;
       }
     else {
         ch = false;
       }
     return ch;
    }

}






