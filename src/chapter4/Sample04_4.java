package chapter4;

public class Sample04_4 {
    public static void main(String[] args) {
        // for 문

//        String[] numbers = {"one", "two", "three"};
//        for (int i=0; i<numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        int[] marks = {90, 25, 67, 45, 80};
        for (int i=0; i< marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            } else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }
    }
}
