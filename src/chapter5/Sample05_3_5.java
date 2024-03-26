package chapter5;

public class Sample05_3_5 {
    int varTest(int a) {
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        Sample05_3_5 sample0535 = new Sample05_3_5();
        a = sample0535.varTest(a);
        System.out.println(a);
    }
}
