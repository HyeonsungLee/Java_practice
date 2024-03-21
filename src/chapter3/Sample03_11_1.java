package chapter3;

public class Sample03_11_1 {
    public static void main(String[] args) {
        // 형 변환과 final

//        String num = "123";
//        int n = Integer.parseInt(num);
//        System.out.println(n);

//        int n = 123;
//        String num = "" + n;
//        System.out.println(num);

//        int n = 123;
//        String num1 = String.valueOf(n);
//        String num2 = Integer.toString(n);
//        System.out.println(num1); // 123 출력
//        System.out.println(num2); // 123 출력

//        String num = "123.456";
//        double d = Double.parseDouble(num);
//        System.out.println(d);

        int n = 123;
        double d1 = n;
        System.out.println(d1);

        double d2 = 123.456;
        int n2 = (int) d2;
        System.out.println(n2);


    }
}
