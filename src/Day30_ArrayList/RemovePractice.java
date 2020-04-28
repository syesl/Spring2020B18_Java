package Day30_ArrayList;

import java.util.ArrayList;

public class RemovePractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
       // {10,20,30}
      //   0   1  2
     //   list.remove(20); index out of bound

        // list.remove(1);
        Integer a= 20;
        boolean r1= list.remove(a); // true
        System.out.println(list);

    }
}
