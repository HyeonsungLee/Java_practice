package chapter4;

public class Sample04_4_1 {
    public static void main(String[] args) {
        // for 문으로 돌아가기 - continue

        int[] marks = {90, 25, 67, 45, 80};
        for (int i=0; i< marks.length; i++) {
            if (marks[i] < 60) {
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }
    }
}
