package chapter3;

public class Sample03_2 {
    public static void main(String[] args) {

        // boolean

        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);
    }
}
