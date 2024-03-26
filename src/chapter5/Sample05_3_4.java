package chapter5;

// return의 또 다른 쓰임

public class Sample05_3_4 {
    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다. ");
    }

    public static void main(String[] args) {
        Sample05_3_4 sample0534 = new Sample05_3_4();
        sample0534.sayNick("야호");
        sample0534.sayNick("바보"); // 출력되지 않음
    }
}
