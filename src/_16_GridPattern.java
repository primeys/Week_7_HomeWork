public class _16_GridPattern {

    public static void main(String[] args)
    {
        grid();
    }

    public static void grid() {

        System.out.println(" : Grid Pattern :");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= 10; j++) {
                System.out.print("-");
            }
            System.out.println(" ");
        }
    }

}
