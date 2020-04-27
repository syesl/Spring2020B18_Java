package Day23_Methods;
/*
1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class warmup {
    public static void main(String[] args) {

    String [] arr = {"A", "A", "B", "C", "C"}; // B is unique
    int count = 0;
    //for (int i=0;i<length;i++){
for(String each: arr ){
    if (each.equals("A")){
        count++;
    }

    }
System.out.println(count);
String [] arr1 = {"a","b","a"};

for(String each: arr1){
    if(each.equals("a")){
        count++;
    }
}
    if (count==1){ // if the character is unique
      //  System.out.println("a");
    }

}
}