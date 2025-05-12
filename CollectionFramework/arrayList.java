package CollectionFramework;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element at the end of list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(20);
        System.out.println(list);

        // get element from the particular index
        System.out.println(list.get(1));

        // add element at particular index
        list.add(0,19);
        System.out.println(list);

        // set element at particular index and remove previous element from the index
        list.set(0, 10);
        System.out.println(list);

        // delete element from particular index
        list.remove(0);
        System.out.println(list);

        // size of arraylist
        list.size();

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
        
    }
}
