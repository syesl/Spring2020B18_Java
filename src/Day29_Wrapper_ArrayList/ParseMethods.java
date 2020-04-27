package Day29_Wrapper_ArrayList;

public class ParseMethods {

    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str);  //123

        System.out.println(str + 1); // text
        //        "123" + 1   ==> "1231"

        System.out.println(a1+1);  // number
        //         123 + 1 ==> 124


        byte b1 =  Byte.parseByte(str);    // byte = 123

        System.out.println( b1 + 5 );

        Integer I1 =  (int)Byte.parseByte(str);  // AutoBoxing

        // Integer  = (int)byte;
        // Integer = int;
String str2 = "10.5";
float f1 = Float.parseFloat (str2);// float 10.5
        System.out.println(f1+1);

        Double.parseDouble(str2); // double 10.5

        String str3 = "3147483647";
        long num1 = Long.parseLong(str3);    // long 3147483647

        System.out.println(num1+2);

        Long num2 = Long.parseLong(str3); // autoboxing

        System.out.println(num2 + 2);

        String result1 = "true"; // not "true" or "false" ==> false

        boolean r1 = Boolean.parseBoolean(result1);   // boolean

        System.out.println(!r1 );








    }

}