public class _19_Diamond {
    //    public class PatternDiamond{
    public static void main(String[] args) {
        patternDiamond();
    }

    public static void patternDiamond() {
        int i = 1;
        int j;
        while (i <= 7) { j = 1;
            while (j++ <= 7 - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = 7 - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= 7 - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}


