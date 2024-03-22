package chapter4;

import java.util.ArrayList;

public class Sample04_1_3 {
    public static void main(String[] args) {
        // else if

        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else if (hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

    }
}
