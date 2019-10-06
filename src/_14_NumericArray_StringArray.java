import java.util.Arrays;

public class _14_NumericArray_StringArray {

    public static void main(String[]args)
    {
        int [] ArrayInt = { 4,50,1984,8,10 };
        String [] ArrayStr  = {"My", "Java","Ram"," Jay","Hari" };
        System.out.println("Original Numeric array"+ Arrays.toString(ArrayInt));
        Arrays.sort(ArrayInt);
        System.out.println("Sorted Numeric array:" +Arrays.toString(ArrayInt));

        System.out.println("Original string Array:" +Arrays.toString(ArrayStr));
        Arrays.sort(ArrayStr);
        System.out.println("Sorted String Array:" + Arrays.toString(ArrayStr));
    }

}
