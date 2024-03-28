package chapter7;

import house.HousePark;

public class Sample07_2 {
    private String secret;
    private String getSecret() {
        return this.secret;
    }

    public static void main(String[] args) {
        HousePark housePark = new HousePark();
        System.out.println(housePark.info);
    }

}
