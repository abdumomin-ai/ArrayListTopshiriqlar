package Collections.lesson;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistTopshiriqlar3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Purple");
        list.add("White");
        list.add("Black");
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        System.out.println("Asl to'plam" + list);

        Collections.reverse(list);
        System.out.println("Teskari toplam" + list);
    }
}
