package Calisma;

public class For_ile_Ucgen {
    public static void main(String[] args) {

        for (int satir= 0; satir<10; satir++)
        {

            for (int bosluk= 9; bosluk>=satir ; bosluk--)
            {

                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz <= satir; yildiz++)
            {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}

