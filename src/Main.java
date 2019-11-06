import Tasks.Arrays;
import Tasks.Collections;
import Tasks.QuadEq;

import java.util.ArrayList;
import java.util.Collection;

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
        new Arrays().iterator(ints);
        new QuadEq().rootsCalc(1, 8, 15);
    }
}
