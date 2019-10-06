import java.util.*;

public class _06_DisplayPattern {

    public static void main(String[] args) {
        _06_DisplayPattern num = new _06_DisplayPattern();
        num.pattern();

    }

    public void pattern() {
        int i, j, number;

        System.out.print("Enter Numbers as per row required:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        for (i = 1; i <= number; i++) {
            //number = 1;

            for (j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}


