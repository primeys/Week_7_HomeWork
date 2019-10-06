import java.util.Scanner;

public class _01_ConsoleEntrySum {
    public static void main(String[] args) {
        int i = 1, j = 0;
        boolean Num;
        Scanner scanner = new Scanner(System.in);
        do { while (i <= 10) {
             System.out.print("Enter Number " + i + ":");
                if (scanner.hasNextInt()) {
                j = j + scanner.nextInt();
                i++;
                Num =true;
                }  else {
                    System.out.println("Wrong Input , Please Enter Again : ");
                    Num=false;
                    scanner.next();
                }
            }
        }while (Num=false);
        System.out.println("Addition of Entered Numbers Is   :  " + j);
        scanner.close();
    }
}
