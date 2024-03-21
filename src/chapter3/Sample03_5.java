package chapter3;

public class Sample03_5 {
    public static void main(String[] args) {
        // StringBuffer

//        StringBuffer sb = new StringBuffer();
//        sb.append("hello");
//        sb.append(" "); // 띄어쓰기
//        sb.append("jump to java");
//        String result = sb.toString();
//        System.out.println(result);

        String result = "";
        result += "hello";
        result += " ";
        result += "jump to java";
        System.out.println(result);

        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello ");
        System.out.println(sb.toString());

        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello jump to java");
        System.out.println(sb1.substring(0, 4));

    }
}
