//Q13. chkDupNum 메서드 만들기
//입 력 예 시 : 0123456789 01234 01234567890 6789012345 012322456789
//출 력 예 시 : true false false true false


import java.util.ArrayList;
public class Main13 {
    static boolean chkDupNum(String data) {
        ArrayList<String> result = new ArrayList<>();
        for (String c : data.split("")) {
            if (result.contains(c)) {
                return false; // 중복된 숫자가 있으면 false
            } else {
                result.add(c);
            }
        }
        return result.size() == 10; // 0~9 모두 10개의 숫자인지 확인
    }
    public static void main(String[] args) {
        System.out.println(chkDupNum("0123456789")); // true
        System.out.println(chkDupNum("01234")); // false
        System.out.println(chkDupNum("01234567890")); // false
        System.out.println(chkDupNum("6789012345")); // true
        System.out.println(chkDupNum("012322456789")); // false
    }
}