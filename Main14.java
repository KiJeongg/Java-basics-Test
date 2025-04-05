//Q14. 모스 부호 해독하기

import java.util.ArrayList;
import java.util.HashMap;
public class Main14 {
    static String morse(String data) {
        HashMap<String, String> info = new HashMap<>() {{
            put(".-", "A");
            put("-...", "B");
            put("-.-.", "C");
            put("-..", "D");
            put(".", "E");
            put("..-.", "F");
            put("--.", "G");
            put("....", "H");
            put("..", "I");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put("--", "M");
            put("-.", "N");
            put("---", "O");
            put(".--.", "P");
            put("--.-", "Q");
            put(".-.", "R");
            put("...", "S");
            put("-", "T");
            put("..-", "U");
            put("...-", "V");
            put(".--", "W");
            put("-..-", "X");
            put("-.--", "Y");
            put("--..", "Z");
        }};
        ArrayList<String> result = new ArrayList<>();
        for (String word : data.split("  ")) {
            for (String c : word.split(" ")) {
                result.add(info.get(c));
            }
            result.add(" ");
        }
        return String.join("", result);
    }
    public static void main(String[] args) {
        System.out.println(morse(".... . ... .-.. . . .--. ... . .- .-. .-.. -.--"));
    }
}