import java.util.Scanner;
import java.util.InputMismatchException; // 입력 예외 처리

public class AttendanceScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1, name2;
        int late1, absent1, late2, absent2;

        try {
            // 첫 번째 학생 입력
            System.out.print("이름 지각 결석 횟수 입력하세요>>");
            name1 = scanner.next();
            late1 = scanner.nextInt();
            absent1 = scanner.nextInt();

            // 두 번째 학생 입력
            System.out.print("이름 지각 결석 횟수 입력하세요>>");
            name2 = scanner.next();
            late2 = scanner.nextInt();
            absent2 = scanner.nextInt();

            // 음수 입력 검사
            if (late1 < 0 || absent1 < 0 || late2 < 0 || absent2 < 0) {
                System.out.println("잘못된 입력입니다.");
                return; // 프로그램 종료
            }

            // 점수 계산
            int score1 = 100 - (late1 * 2) - (absent1 * 5);
            int score2 = 100 - (late2 * 2) - (absent2 * 5);

            // 점수 비교 (동점 처리 포함)
            if (score1 > score2) {
                System.out.println("출석 점수가 높은 학생은 " + name1 + "입니다.");
            } else if (score2 > score1) {
                System.out.println("출석 점수가 높은 학생은 " + name2 + "입니다.");
            } else {
                System.out.println("두 학생의 점수가 같습니다.");
            }

        } catch (InputMismatchException e) {
            // 숫자 입력 오류 처리
            System.out.println("잘못된 입력입니다.");
        }

        scanner.close();
    }
}