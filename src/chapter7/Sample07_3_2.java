package chapter7;

class Counter {
    static int count = 0;
    Counter() {
        count++;    // count는 더 이상 객체 변수가 아니므로 this를 제거하는 것이 좋다.
        System.out.println(count);  // this 제거
    }

    public static int getCount() {
        return count;
    }
}

public class Sample07_3_2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount()); // 스태틱 메서드는 클래스를 이용하여 호출
    }
}
