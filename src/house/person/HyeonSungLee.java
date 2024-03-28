package house.person;

import house.HousePark;

public class HyeonSungLee extends HousePark {   // HousePark을 상속했다.
    public static void main(String[] args) {
        HyeonSungLee lee = new HyeonSungLee();
        System.out.println(lee.lastname);   // 상속한 클래스의 protected 변수는 접근이 가능하다.
    }
}
