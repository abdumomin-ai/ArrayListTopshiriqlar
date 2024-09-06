package Collections.lesson;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTopshiriqlar2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("I");
        list.add("He");
        list.add("She");
        list.add("It");
        list.add("I2");

        String qidirilayotganShaxs = "I2";

        if(list.contains(qidirilayotganShaxs)) {
            System.out.println(qidirilayotganShaxs + " ro'yxatda topildi.");
        } else {
            System.out.println(qidirilayotganShaxs + " ro'yxatda topilmadi.");
        }

        System.out.println("--------------");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("I");
        list1.add("He");
        list1.add("She");
        list1.add("It");
        list1.add("I3");

        ArrayList<String> list2 = new ArrayList<>(list1);

        System.out.println("Nusxa ro'yxat:" +list2);

        System.out.println("--------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("I");
        list3.add("He");
        list3.add("She");
        list3.add("It");
        list3.add("I4");

        System.out.println("Aralashtirishdan oldin" + list3);

        Collections.shuffle(list3);

        System.out.println("Aralashtirishdan keyin" + list3);
    }
}
