//Q8. 파일을 읽어 평균값 저장하기
//다음과 같이 총 10 줄로 이루어진 sample.txt 파일이 있다.
//sample.txt 파일의 숫잣값을 모두 읽어 총합 평균값을 구한 후
// 평균값을 result.txt 파일에 저장하는 프로그램을 만들기
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Main8 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            lines.add(line);
        }
        br.close();

        int total = 0;
        for (String line : lines) {
            line = line.trim();
            int num = Integer.parseInt(line);
            total += num;
        }
        float average = (float) total / lines.size();

        System.out.printf(" 총합 :%d, 평  :%.2f\n", total, average);

        PrintWriter pw = new PrintWriter("result.txt");
        pw.write(String.format("%.2f", average));

                pw.close();
    }
}