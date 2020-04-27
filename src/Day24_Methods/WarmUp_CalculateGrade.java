package Day24_Methods;
/*
1. write a method that accepts 3 parameters: 2
numbers and operator, and prints our the calculation
if operator is not betwwen [-,+,*,/,%] output should be invalid.
ex: calculate(10,2,*)==> 20
2. write a method that can calculate grade

 */
public class WarmUp_CalculateGrade {
    public static void main(String[] args) {
calculate(10,5,"/");
    }
    public static void CalculateGrades(int score){


    }
  public static void calculate (int a,int b, String Ope) {
        String result= "";
        if (Ope.equals("-")){
            result +=(a-b);
        } else if(Ope.equals("+")){
            result += (a+b);
        }else if(Ope.equals("*")) {
            result += (a * b);
        }else if(Ope.equals("/")) {
            result += (a/b);
        }else if(Ope.equals("%")){
            result += (a%b);
        } else {
            result = "Invalid operator";
        }
        // changing all to ternary method is below.
        String result2="";
  result2 += (Ope.equals("-")) ? (a-b) : (Ope.equals("+")) ?(a+b):
          (Ope.equals("*")) ? (a*b) : (Ope.equals("/")) ? (a/b) :
                  (Ope.equals("%")) ? (a%b): "Invalid operator" ;

  System.out.println(result2);
  }





}
