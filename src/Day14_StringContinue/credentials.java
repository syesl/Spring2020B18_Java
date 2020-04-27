package Day14_StringContinue;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {

   /*
        userName: cybertek
        passWord: cybertekschool
    */
   String validUname = "cybertek";
   String validpswd ="school";
   Scanner input = new Scanner(System.in);

   System.out.println("Enter your username");
   String username = input.next();
   System.out.println("Enter your password");
   String pswd = input.next();

   boolean valid = validUname.equals(username) && validpswd.equals(pswd);

   if (valid) {
       System.out.println("Login succesfully");
   }else{
       System.out.println("Invalid credentials");
   }






    }
}