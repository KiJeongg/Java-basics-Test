//Q5. 한 줄 구구단 만들기
//숫자 2~9 중 하나를 입력받아 해당 숫자의 구구단을 한 줄로 출력하는 프로그램 만들기


import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 구구단을 출력할 숫자를 입력하세요 (2~9):");
        int num = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d ", i * num);


        }
    }
}