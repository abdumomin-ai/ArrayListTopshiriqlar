package Collections.lesson;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTopshiriqlar5 {

    public static <T> void swapElements(ArrayList<T> list, int index1, int index2) {
        if (index1 < list.size() && index2 < list.size()) {
            Collections.swap(list, index1, index2);
        } else {
            System.out.println("Index xatolik!");
        }
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static void createAndExpandList() {
        ArrayList<Integer> list = new ArrayList<>(3);

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("3 ta elementli list: " + list);

        list.ensureCapacity(6);

        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("O'lchami oshirilgan list: " + list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println("Oldin: " + list1);
        swapElements(list1, 1, 3);
        System.out.println("Keyin: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Birlashtirilgan: " + mergedList);

        createAndExpandList();
    }
}



