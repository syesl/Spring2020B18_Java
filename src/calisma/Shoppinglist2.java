package calisma;
import java.util.Scanner;
public class Shoppinglist2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Item2 and its price:");
        double Price1 = scan.nextDouble();
        String Item1= scan.next();
        System.out.println("Enter Item2 and its price:");
        double Price2= scan.nextDouble();
        String Item2= scan.next();
        System.out.println("Enter Item3 and its price:");
        double Price3= scan.nextDouble();
        String Item3= scan.next();
        String totalPrice= (Item1+Item2+Item3);



        String report = "Item1: "+Item1+" Price: "+Price1+", "+"Item2: "+Item2+ "Price: "+Price2+", "+"Item3: "+Item3+"Price: "+Price3;
        String totalprice="Total price: "+totalPrice;

        System.out.println(report);

    }
}







