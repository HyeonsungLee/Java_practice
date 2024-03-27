package chapter6;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample06_2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("C:/out.txt");
        for (int i=1; i < 11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}
