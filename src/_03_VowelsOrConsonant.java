import java.util.Scanner;

public class _03_VowelsOrConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet char: ");

        String in = scanner.next().toLowerCase();
        //to find uppercase
        boolean uppercase = in.charAt(0) >= 65 && in.charAt(0) <= 90;
        // to find lowercase
        boolean lowercase = in.charAt(0) >= 97 && in.charAt(0) <= 122;

        //character is vowels or not
        boolean vowels = in.equals("a") || in.equals("e") || in.equals("i") || in.equals("o") || in.equals("u");

        if (in.length() > 1) {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels) {
            System.out.println("Input letter is Vowel");
        }
        else {
            System.out.println("Input letter is Consonant");
        }
    }
}
