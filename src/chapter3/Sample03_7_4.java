package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample03_7_4 {
    public static void main(String[] args) {

        // String.join 사용전

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = "";
//        for (int i = 0; i < pitches.size(); i++) {
//            result += pitches.get(i);
//            result += ","; // 콤마를 추가
//        }
//        result = result.substring(0, result.length() - 1); // 마지막 콤마 제거
//        System.out.println(result);

        // String.join 사용

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = String.join(",", pitches);
//        System.out.println(result);

//        String[] pitches = new String[]{"138", "129", "142"};
//        String result = String.join(",", pitches);
//        System.out.println(result);

        // 리스트 정렬

        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순 정렬
        System.out.println(pitches);

    }
}
