import java.util.Scanner;

public class DayIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 키보드 입력을 받기 위한 객체 생성

        // 사용자에게 안내 메시지 출력
        System.out.print("3월 중 날짜를 입력하면 요일을 알려 드립니다>>");

        int day = scanner.nextInt(); // 날짜를 정수로 입력받음

        // 입력값이 1~31 범위를 벗어나면 오류 메시지 출력 후 종료
        if (day < 1 || day > 31) {
            System.out.println("잘못된 입력입니다.");
            return; // 프로그램 종료
        }

        // 요일 계산
        // 3월 1일이 금요일이므로 기준을 맞추기 위해 (day - 1)
        // 7로 나눈 나머지를 이용해 요일 결정
        int result = (day - 1) % 7;

        // result 값에 따라 요일을 출력
        if (result == 0) {
            System.out.println("3월 " + day + "일은 금요일입니다.");
        }
        else if (result == 1) {
            System.out.println("3월 " + day + "일은 토요일입니다.");
        }
        else if (result == 2) {
            System.out.println("3월 " + day + "일은 일요일입니다.");
        }
        else if (result == 3) {
            System.out.println("3월 " + day + "일은 월요일입니다.");
        }
        else if (result == 4) {
            System.out.println("3월 " + day + "일은 화요일입니다.");
        }
        else if (result == 5) {
            System.out.println("3월 " + day + "일은 수요일입니다.");
        }
        else {
            // result == 6인 경우
            System.out.println("3월 " + day + "일은 목요일입니다.");
        }

        scanner.close(); // Scanner 자원 해제
    }
}