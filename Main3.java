//Q3. 50 점 이상인 점수의 총합 구하기

public class Main3 {
    public static void main(String[] args) {
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total = 0;
        for (int a : A) {
            if (a >= 50) {
                total += a;
            }
        }
        System.out.println(total); // 481 출력
    }
}