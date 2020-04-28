package Day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {
    /*
    1. write a program
     */

    public static void main(String[] args) {
        String str= "a1b2c3";
        char[] arr =str.toCharArray();

        System.out.println(Arrays.toString(arr));

        int sum= 0; // will contain sum of all digits

        for (char each : arr ) {  //'0'
            boolean isDigit = each >= 48 && each <= 57; // if each is digit, we will convert to int and add it to sum
            if (isDigit){
                sum += Integer.parseInt(""+each); //"0"
            }

        }
        System.out.println(sum);

    }
}
