package day12.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMV");
        list.add("Lada");
        list.add("Tesla");
        list.add("Toyota");

        System.out.println(list);

        list.add(2, "Mersedes");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

    }
}
