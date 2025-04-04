//Q7. 파일을 읽어 역순으로 저장하기
// abc.txt 안에 파일은 역순으로 저장 후 result.txt로 저장해보기

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
public class Main7 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            lines.add(line);
        }
        br.close();

        lines.sort(Comparator.reverseOrder());
        PrintWriter pw = new PrintWriter("result.txt");
        for (String line : lines) {
            pw.println(line);
        }
        pw.close();
    }
}
