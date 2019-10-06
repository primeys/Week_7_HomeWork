import java.util.Arrays;

public class _18_ArrayContainsSpecificValue {

    public static void main(String[] args)
    {
      int arry[] = {10,30,40,28,37,46};
      int toCheckValue = 37;
        System.out.println("Array:" + Arrays.toString(arry));
            ArrayValue (arry,toCheckValue);
   }
    private static void ArrayValue(int[] arr, int toCheckValue)
    {
        boolean find = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                find = true;
                break;
            }
        }
        System.out.println("Is " + toCheckValue + " present in the array: " + "\n" +find);
    }
}