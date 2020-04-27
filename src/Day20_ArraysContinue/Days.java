package Day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String [] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
       /* if (num>7 || num<1 ){
            System.out.println("Invalid entry");
            System.exit(0);
        }
*/
       int attempts= 1;
       while (num>7 || num<1){
           System.exit(0);
       }
        String result = days[num-1];
        System.out.println(result);






        System.out.println(result);









    }
}
