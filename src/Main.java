import Tasks.Arrays;
import Tasks.Collections;
import Tasks.QuadEq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Integer[] ints = new Integer[]{1, 3, 5, 7, 9, 54};
        collection.add("boom");
        collection.add("boom");
        collection.add("zoom");
        collection.add("zoom");
        collection.add("doom");
        collection.add("doom");
        System.out.println(collection);
        System.out.println(new Collections().noDups(collection));
        new QuadEq().rootsCalc(1, 8, 15);

        Arrays<Integer> arr = new Arrays<>(ints);
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (it.hasNext())
                System.out.print(i + ", ");
            else
                System.out.println(i);
        }
    }
}
