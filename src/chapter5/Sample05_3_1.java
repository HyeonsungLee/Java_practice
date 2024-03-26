package chapter5;

// 리턴값이 없는 메서드

public class Sample05_3_1 {
    void sum(int a, int b) {
        System.out.println(a+"과" +b+ " 의 합은 "+(a+b)+"입니다.");
    }

    public static void main(String[] args) {
        Sample05_3_1 sample05_3_1 = new Sample05_3_1();
        sample05_3_1.sum(3, 4);
    }
}
