import java.util.Scanner;
import java.util.InputMismatchException; // 입력 타입 오류 처리용

public class SeasonSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        try {
            System.out.print("월을 입력하세요(1~12)>>");

            int month = scanner.nextInt(); // 정수 입력 받기

            // 입력된 월에 따라 계절 출력
            switch (month) {

                // 봄 (3~5)
                case 3: case 4: case 5:
                    System.out.println("따뜻한 봄");
                    break;

                // 여름 (6~8)
                case 6: case 7: case 8:
                    System.out.println("바다가 즐거운 여름");
                    break;

                // 가을 (9~11)
                case 9: case 10: case 11:
                    System.out.println("낙엽이 지는 아름다운 가을");
                    break;

                // 겨울 (12, 1, 2)
                case 12: case 1: case 2:
                    System.out.println("눈 내리는 하얀 겨울");
                    break;

                // 1~12 외 입력
                default:
                    System.out.println("1~12만 입력하세요.");
            }

        } catch (InputMismatchException e) {
            // 숫자가 아닌 값 입력 시 실행됨
            System.out.println("1~12만 입력하세요.");
        }

        scanner.close(); // Scanner 자원 해제
    }
}