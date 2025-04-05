//Q10. 오류에 상관없이 모두 수행하기
//다음은 Random 클래스를 사용하여 0~10 사이의 숫자를 무작위로 생성한 후, 입력 숫자가 짝수인 경우에는 ‘짝수입니다.’
// 출력하고 홀수인 경우에는 OddException 을 발생시키는 코드이다. 종료하지 않고 10번까지 호출하기


import java.util.Random;

// 사용자 정의 예외 클래스
class OddException extends Exception {
    public OddException(String message) {
        super(message); // 예외 메시지를 Exception 클래스에 전달
    }
}

public class Main10 {
    // 숫자를 받아서 홀수면 예외 발생, 짝수면 출력
    static void execute(int n) throws OddException {
        System.out.printf("입력 숫자: %d\n", n);
        if (n % 2 == 1) {
            throw new OddException("⚠ 홀수입니다! 예외 발생!");
        }
        System.out.println("짝수입니다.");
    }

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                // 1부터 10까지의 랜덤 정수 생성
                execute(r.nextInt(10) + 1);
            } catch (OddException e) {
                // 예외 메시지 출력
                System.out.println(e.getMessage());
                // 필요하면 다음 줄처럼 전체 에러 추적도 출력 가능:
                // e.printStackTrace();
            }
            System.out.println("------------");
        }
    }
}