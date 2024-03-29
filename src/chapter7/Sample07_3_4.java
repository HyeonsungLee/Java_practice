package chapter7;
    // 싱글톤 패턴

class Singleton {
    private static Singleton one;
    private Singleton(){
    }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton();
        }
        return one;
    }
}

public class Sample07_3_4 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2); // true 출력
    }
}
