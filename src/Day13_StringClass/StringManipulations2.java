package Day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str = "Cybertek School is the best";
        //            012345678
        String schoolName = str.substring(0,8);

        System.out.println(schoolName);
        String fullName = " Sevinc Yesil";
        String firstName = fullName.substring(0, 7);
        String lastName = fullName.substring(7,12+1);
        System.out.println(firstName);
        System.out.println(lastName);

        // full name  =firstname  lastname
        // gmail: lastName_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        //                0123456789.....
        String name  = Murtaza.substring(0,6+1);
        String lname = Murtaza.substring(8, 14+1);
        System.out.println(name);
        System.out.println(lname);

       String gmail = lname.concat("_").concat(name).concat("@gmail.com");
        //String gmail = lname + "_"+ name + "@gmail.com";


     // String gmail = Murtaza.substring(8, 14+1) +"_"+Murtaza.substring(0, 6+1 ) + "@gmail.com";

                        System.out.println(gmail);
        String s1 = "I love Java Programming Language";

        String classname  = s1.substring(7);
        System.out.println(classname);

        String s2 = "I like C# Programming C# C#";
        s2 = s2.replace("C#","Java");
        System.out.println(s2);

        String names= "Covid 18";
        names = names.replace("8","9");
        System.out.println(names);
     String r1 = "I like C#, C# is fun, C# is cool";
     r1 = r1.replaceFirst("C#" , "Java");
        System.out.println(r1);
        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);







    }
}
