package Collections.lesson;

import java.util.ArrayList;

public class ArraylistTopshiriqlar1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Purple");
        list.add("White");
        list.add("Black");
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("--------------");
        list.set(0,"Pink");
        list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("To'plamning o'lchami = " +list.size());

    }
}
