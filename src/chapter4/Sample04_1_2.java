package chapter4;

import java.util.ArrayList;

public class Sample04_1_2 {
    public static void main(String[] args) {
        // contains

        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }
    }
}
