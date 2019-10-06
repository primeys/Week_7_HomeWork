public class _09_FibonacciNumber {

    public static void main(String[] args) {

        FibonacciNumber();
    }
    public static void FibonacciNumber()

    {
        int x  = 0, y =1, z ;
        System.out.print(x + ","+ y + "," );
       /// out put required up to 8 Count so we check <9
        for(int i = 2 ; i< 9 ; i++){
            z = x + y ;
            System.out.print(z + ",");
            x = y;
            y = z;
        }
    }
}
