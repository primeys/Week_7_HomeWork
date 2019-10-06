import java.util.Scanner;

public class _12_IsPrimeNumberOrNot {

    public static void main(String[] args) {
        _12_IsPrimeNumberOrNot prime = new _12_IsPrimeNumberOrNot();
        prime.findPrimeNumber();

    }
    public void findPrimeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num  = sc.nextInt();
        if(num >1 && num % 1 == 0 && num / num ==1){
        System.out.println("Your number: " +num + " is a Prime Number ");
       }else{
            System.out.println("Your number "+ num + "is not prime number: ");
            }
    }
}


