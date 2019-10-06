import java.util.Scanner;

public class _13_ShredDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first No.: ");
        int n1= scanner.nextInt();
        System.out.print("Enter your Second No.: ");
        int n2= scanner.nextInt();
        System.out.print("Your entry is: " + hasSharedDigit(n1,n2));
    }
    public static boolean hasSharedDigit(int x ,int y){

        if(( x >= 10 && x <= 99) && (y >= 10 && y <= 99)){
            return true;
        } else {
            return false;
        }
    }

 }

