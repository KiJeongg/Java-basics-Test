//Q12. 문자열 압축하기
//입 력 예 시 : aaabbcccccca
//출 력 예 시 : a3b2c6a1



public class Main12 {
     static String compressString(String data) {
         String _c = "";
         int cnt = 0;
         String result = "";

         for (String c : data.split("")) {
             if (!c.equals(_c)) {
                 _c = c;
                 if (cnt > 0) {
                     result += "" + cnt;
                 }
                 result += c;
                 cnt = 1;
             } else {
                 cnt += 1;
             }
         }
         if (cnt > 0) {
             result += "" + cnt;
         }
         return result;
     }
    public static void main(String[] args) {
        String result = compressString("aaabbcccccca");
        System.out.println(result);
     }
}
