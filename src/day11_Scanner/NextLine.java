package day11_Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name:");
        String fullNAme = input.nextLine(); // accepts the "Enter"
        System.out.println("Your full name is: " + fullNAme);

        System.out.println("Enter your sentense: ");

        String sentence = input.nextLine();
        System.out.println("You entered: "+ sentence);






    }
}
