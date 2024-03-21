package chapter3;

import java.util.Arrays;
import java.util.HashSet;

public class Sample03_9_1 {
    public static void main(String[] args) {
        // 집합(Hash set, retainAll, addAll, removeAll)

//        HashSet<String> set = new HashSet<>(Arrays.asList("H","e", "l", "l", "o"));
//        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

//        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성
//        intersection.retainAll(s2); // 교집합 수행
//        System.out.println(intersection);

//        HashSet<Integer> union = new HashSet<>(s1);
//        union.addAll(s2); // 합집합 수행
//        System.out.println(union);

        HashSet<Integer> sub = new HashSet<>(s1);
        sub.removeAll(s2); // 차집합 수행
        System.out.println(sub);
    }
}
