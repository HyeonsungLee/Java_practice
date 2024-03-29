package chapter7;
    // 예외 처리
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Sample07_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
        br.readLine();
        br.close();
    }
}
