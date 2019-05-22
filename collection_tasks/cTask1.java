package collection_tasks;

import java.util.*;

public class cTask1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        int i;

        for (i = 0; i < 100; i++) {
            list.add((int) (Math.random()*100));
        }

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);
    }
}
