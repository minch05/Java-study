import java.util.Scanner;

public class DaySwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 입력을 위한 Scanner 생성

        // 사용자에게 입력 안내
        System.out.print("3월 중 날짜를 입력하면 요일을 알려 드립니다>>");

        int day = scanner.nextInt(); // 날짜 입력

        // 날짜 범위 체크 (1~31만 허용)
        if (day < 1 || day > 31) {
            System.out.println("잘못된 입력입니다.");
            return; // 잘못된 입력이면 프로그램 종료
        }

        // 요일 계산
        // (day - 1) : 3월 1일을 기준으로 맞추기 위함
        // % 7 : 요일은 7일마다 반복되므로 나머지 사용
        int result = (day - 1) % 7;

        // switch문으로 요일 출력
        switch (result) {

            case 0:
                // 0이면 금요일
                System.out.println("3월 " + day + "일은 금요일입니다.");
                break;

            case 1:
                // 1이면 토요일
                System.out.println("3월 " + day + "일은 토요일입니다.");
                break;

            case 2:
                // 2이면 일요일
                System.out.println("3월 " + day + "일은 일요일입니다.");
                break;

            case 3:
                // 3이면 월요일
                System.out.println("3월 " + day + "일은 월요일입니다.");
                break;

            case 4:
                // 4이면 화요일
                System.out.println("3월 " + day + "일은 화요일입니다.");
                break;

            case 5:
                // 5이면 수요일
                System.out.println("3월 " + day + "일은 수요일입니다.");
                break;

            case 6:
                // 6이면 목요일
                System.out.println("3월 " + day + "일은 목요일입니다.");
                break;
        }

        scanner.close(); // Scanner 종료
    }
}