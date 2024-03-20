package chapter3;

public class Sample03_1 {
    public static void main(String[] args) {
        // 숫자 연산
        int a = 10;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(7%3);
        System.out.println(3%7);


        //증감 연산
        int i = 0;
        int j = 10;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);

        int q = 0;
        System.out.println(q++); // 0 출력
        System.out.println(q); // 1 출력

        int w = 0;
        System.out.println(++w); // 1 출력
        System.out.println(w); // 1 출력

    }
}
