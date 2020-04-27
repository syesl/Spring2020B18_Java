package Day20_ArraysContinue;
import java.util.Arrays;
public class ArraysUtilities {
    public static void main(String[] args) { // [] bracket i istedigin yere koyabilirsin parantezin icinde
        int [] arr= {1,2,3}; // convert to array to string
       String r=  Arrays.toString(arr); // convert to array to string then returns us string
        System.out.println(r);

        System.out.println(arr); //Array must be converted to string before we print
// [I@61bbe9ba bu error codunu veriyor
        String names[]= {"Madina","Fatih","Osman"};

        System.out.println(Arrays.toString(names));

        double [] nums = {10,20,30,40,50};

     //   System.out.println(nums); // give me error
        System.out.println( Arrays.toString( nums)); // return me double 10.0 20.0

        System.out.println(nums[0]); // return me double 10.0
        System.out.println(nums[0]+1); //11.0






         }





}
