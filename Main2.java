//Q2.맵에서 값 추출하기
//수정하여’C’ 에 해당하는 key 값이 없을 경우, null 대신 70 을 출력해 보기
//
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);
        System.out.println(a.getOrDefault("C",70));

    }
}
