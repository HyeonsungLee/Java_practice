package chapter3;

import java.util.ArrayList;

public class Sample03_7_2 {
    public static void main(String[] args) {
        // 제네릭스

        // 제네릭스를 사용하지 않은 예

//        ArrayList pitches = new ArrayList();
//        pitches.add("138");
//        pitches.add("129");
//
//        String one = (String) pitches.get(0);
//        String two = (String) pitches.get(1);

        // 제네릭스 적용

        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");

        String one = pitches.get(0);
        String two = pitches.get(1);




    }
}
