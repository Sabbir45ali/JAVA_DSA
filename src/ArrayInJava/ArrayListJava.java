package ArrayInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListJava {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(20);
        list.add(3423);
        list.add(4223);
        list.add(423);
        list.add(2042);
        list.add(4233);

        System.out.println(list);
        System.out.println(list.indexOf(423));

        System.out.println(list.contains(6575));
    }
}
