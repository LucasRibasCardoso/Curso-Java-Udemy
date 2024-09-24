package Modulo10.Set;

import java.util.HashSet;
import java.util.Set;

public class Program01 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        set.remove("Tablet");
        set.removeIf(p -> p.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }
    }
}
