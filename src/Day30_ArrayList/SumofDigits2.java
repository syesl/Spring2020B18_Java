package Day30_ArrayList;
import java.util.Arrays;

public class SumofDigits2 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        int sum = 0; // will contain sum of all digits
        for (char each : arr) {
if (Character.isDigit(each)){
    sum +=Integer.parseInt(""+each);
}
        }
        System.out.println(sum);

        boolean a = Character.isAlphabetic('A');
        // identifies if the character is alphapet
        /*
        extract the digits and the letters form a string
         */

    }
}
