package day03_VariablesContinue;
/*
comparison operators:
>: greater
>=: greater or equal
<: less
<=: less or equal
==: equal
!=: not equal
 */
public class VariablesContinue {
    public static void main(String[] args) {
        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9; // true
        System.out.println(result3);
        System.out.println( true == false );

        System.out.println( "Muhtar" == "Good Guy"); // totall false
        //                  Bad Guy == Good guy  ==> false

        System.out.println("Muhtar" != "Good Guy"); // true
        //                  Bad Guy != Good Guy  == true

        boolean r1 = true !=true;  //false
        System.out.println(r1);
        boolean r2 = "Batch 17" == "Batch 18";
        System.out.println(r2);

        System.out.println("=====================");
        char c1 = 'A';
        System.out.println(c1);
        char c2 =45000;
        System.out.println(c2);
        char c3 = 25000;
        System.out.println(c3);
        char c4 =100;
        System.out.println(c4);
        char ch5 = 'D'; // 68
        System.out.println(ch5); // D

        int num1 = 'D'; //number
        System.out.println(num1);
        char a1 = 'z';  //byte b1 =a1;
        // char is larger than byte
        byte b1 ='z';
        // short s1 = a1 ; // char is larger than short
        int i1 = a1; // int is larger than char



    }
}
