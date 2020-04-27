package Day23_Methods;

public class Methods_WtihParamters2 {
    //3. create a function  that can reverse any string
   // "Muhtar" ==>rathuM, "Cybertek" ==> ketrebyC
    public static void main(String[] args) {
        String names = "Sevinc";
        ReverseString(names);
        System.out.println("Hello");
        String name2= "Cybertek School";
        ReverseString(name2);
    }
    public static void ReverseString(String str) {
        for (int i =str.length()-1; i>=0 ;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
