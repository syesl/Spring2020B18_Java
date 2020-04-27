package day02_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\tHello");
        System.out.println("Hello");
        System.out.println("\t\t\t\t\tHello");
        // \t it means a paragraph space
        System.out.println("Cybertek School");
        System.out.println("Cybertek \nSchool");
        System.out.println("\n\nMy\nName\nIs\nSevinc");
        // \n means new line, starts with new line
        System.out.println("My favorite TV shows is \"Game of Thrones\"");
        System.out.println("My favorite book is \"ASK\"");
        System.out.println("\\");
        // \\ prints single slash on console
        System.out.println("/");
        System.out.println("My favorite book is 'Java'"); // \' prints the '
        System.out.println("My favorite book is \'Java\'"); // ' prints the '
    }
}
