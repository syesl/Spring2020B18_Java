package Day15_forLoop;
import java.util.Scanner;

/*
1. write a program that asks user's first and last name, then prints out the initials of the user
            Ex:
                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
 */


    public class Initials {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter your first name");
            String firstName  =  scan.next();

            System.out.println("Enter your last name");
            String lastName  =  scan.next();

String initials = firstName.substring(0,1)+ lastName.substring(0,1);
  //initials= initials.toUpperCase();
            String initials2 = firstName.substring(0).toUpperCase() +  lastName.substring(0,1).toUpperCase();


            String initials3= "" + firstName.charAt(0) + lastName.charAt(0);  // returns string

            initials3= initials3.toUpperCase();
            System.out.println(initials);
            System.out.println(initials2);



        }

    }
