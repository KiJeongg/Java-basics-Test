//Q6. 입력 숫자의 총합 구하기


import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 입력해 주세요 :");
        String userInput = sc.nextLine();
        String[] numbers = userInput.split(",");
        int total = 0;
        for(String num: numbers) {
            num = num.trim();
            int n = Integer.parseInt(num);
            total += n;
        }
        System.out.printf(" 총합은 %d입니다 .\n", total);
    }
}