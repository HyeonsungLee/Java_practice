package chapter3;

import java.util.Arrays;
import java.util.HashSet;

public class Sample03_9_2 {
    public static void main(String[] args) {

//        HashSet<String> set = new HashSet<>();
//        set.add("jump");
//        set.add("to");
//        set.add("java");
//        System.out.println(set);

//        HashSet<String> set = new HashSet<>();
//        set.add("jump");
//        set.addAll(Arrays.asList("to", "java"));
//        System.out.println(set);

        HashSet<String> set = new HashSet<>(Arrays.asList("jump","to", "java"));
        set.remove("to");
        System.out.println(set);
    }
}
