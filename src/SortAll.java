import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortAll implements Methods{
    @Override
    public int[] sortArrray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    @Override
    public ArrayList<Integer> sortArrraList(ArrayList<Integer> sortAlls) {
        Collections.sort(sortAlls);
        return sortAlls;
    }

    @Override
    public LinkedList<Integer> sortLinkedList(LinkedList<Integer> sortAlls) {
        Collections.sort(sortAlls);
        return sortAlls;
    }


    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}