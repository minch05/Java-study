import java.util.Scanner;
import java.util.InputMismatchException; // 입력 타입 오류 처리용

public class SeasonIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        try {
            System.out.print("월을 입력하세요(1~12)>>");

            int month = scanner.nextInt(); // 정수 입력 받기

            // 봄 (3~5)
            if (month >= 3 && month <= 5) {
                System.out.println("따뜻한 봄");
            }
            // 여름 (6~8)
            else if (month >= 6 && month <= 8) {
                System.out.println("바다가 즐거운 여름");
            }
            // 가을 (9~11)
            else if (month >= 9 && month <= 11) {
                System.out.println("낙엽이 지는 아름다운 가을");
            }
            // 겨울 (12, 1, 2)
            else if (month == 12 || month == 1 || month == 2) {
                System.out.println("눈 내리는 하얀 겨울");
            }
            // 범위 밖 입력
            else {
                System.out.println("1~12만 입력하세요.");
            }

        } catch (InputMismatchException e) {
            // 숫자가 아닌 값 입력 시 실행됨
            System.out.println("1~12만 입력하세요.");
        }

        scanner.close(); // Scanner 자원 해제
    }
}