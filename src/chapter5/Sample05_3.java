package chapter5;

// 메서드

public class Sample05_3 {
    int sum(int a, int b) {  // a, b는 매개 변수
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Sample05_3 sample05_3 = new Sample05_3();
        int c = sample05_3.sum(a, b);

        System.out.println(c);
    }
}
