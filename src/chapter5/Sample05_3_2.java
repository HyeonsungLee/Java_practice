package chapter5;

// 입력값이 없는 메서드

public class Sample05_3_2 {
    String say() {
        return "Hi";
    }

    public static void main(String[] args) {
        Sample05_3_2 sample05_3_2 = new Sample05_3_2();
        String a = sample05_3_2.say();
        System.out.println(a); // "Hi" 출력
    }
}
