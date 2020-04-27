package calisma;

public class ArraysDemo {
    public static void main(String[] args) {
        // String ogrenci1 = "Engin";
        // String ogrenci2 = " Derin";
        // String ogrenci3 = "Salih";


        String[] ogrenciler = new String[4];

        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Sevinc";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        System.out.println("=======================");
        double[] mylist = {1.2, 1.3, 1.4, 1.5};
        double total = 0;
        double max = mylist[0];
        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam: " + total);
        System.out.println("MAX: " + max);
    }
}
