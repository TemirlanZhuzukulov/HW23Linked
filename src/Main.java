import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SortAll sortAll = new SortAll();
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 1; i < array.length; i++) {
            array[i]=random.nextInt(0,2);
        }
        System.out.print(" sort  Array :");
        System.out.println(Arrays.toString(sortAll.sortArrray(array)));

        ArrayList<Integer> sortAlls = new ArrayList<>();
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));

        System.out.print(" sort  ArrayList :");
        System.out.println(sortAll.sortArrraList(sortAlls));


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));

        System.out.print(" sort  LinkedLIst :");
        System.out.println(sortAll.sortLinkedList(linkedList));
    }
}