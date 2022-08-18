import java.util.*;

public class ArrayLists {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add element
        list.add(0);
        list.add(2);
        list.add(4);

        System.out.println(list);

        //get element
        int element = list.get(1);

        System.out.println(element);

        //add 9 at index 1
        list.add(1,9);

        System.out.println(list);

        //set 3 at index 0
        list.set(0,3);
        System.out.println(list);

        //delete element at index 3

        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //sorting
        Collections.sort(list);
        System.out.println(list);


    }
}
