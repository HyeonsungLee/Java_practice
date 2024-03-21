package chapter3;

import java.util.ArrayList;

public class Sample03_7_1 {
    public static void main(String[] args) {
        // 리스트

        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches.get(1));

        System.out.println(pitches.size());

        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("129"));

        System.out.println(pitches.remove(1));

    }
}
