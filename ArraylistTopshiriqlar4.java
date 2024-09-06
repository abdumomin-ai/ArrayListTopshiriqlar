package Collections.lesson;

import java.util.ArrayList;

public class ArraylistTopshiriqlar4 {
    public static ArrayList<String> solishtirish(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> natija = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                natija.add("Yes");
            } else {
                natija.add("No");
            }
        }

        return natija;
    }

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Green");
        list1.add("Red");
        list1.add("Blue");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Green");
        list2.add("Black");
        list2.add("Blue");


        System.out.println("Birinchi ro'yxat: " + list1);
        System.out.println("Ikkinchi ro'yxat: " + list2);


        ArrayList<String> natija = solishtirish(list1, list2);


        System.out.println("Natijaviy ro'yxat: " + natija);
    }
}

