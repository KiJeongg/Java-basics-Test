//함수형 프로그래밍 사용


import java.util.Arrays;
public class Main3_2{
    public static void main(String[] args) {
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total = Arrays.stream(A).filter((a) -> a >= 50).sum();
        System.out.println(total); // 481 출력

    }
}