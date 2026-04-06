import java.util.Objects;
import java.util.Scanner;

public class RPSgame {
    public static void main(String[] args) {

        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 안내 메시지 출력
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");

        // 철수 입력 받기
        System.out.print("철수 >> ");
        String chrps = scanner.next();  // 문자열 입력 (가위/바위/보/묵/찌/빠)

        // 영희 입력 받기
        System.out.print("영희 >> ");
        String yorps = scanner.next();  // 문자열 입력

        // 묵찌빠 입력을 가위바위보로 변환
        // 예: 묵 -> 바위, 찌 -> 가위, 빠 -> 보
        chrps = convert(chrps);
        yorps = convert(yorps);

        // 입력값이 잘못된 경우 (convert 함수에서 null 반환됨)
        if (chrps == null || yorps == null) {
            System.out.println("가위/바위/보 또는 묵/찌/빠 중에서 입력하세요");
        }

        // 두 사람이 같은 것을 냈을 경우 -> 비김
        else if (Objects.equals(chrps, yorps)) {
            System.out.println("비겼습니다");
        }

        // 철수가 이기는 경우
        // 가위 > 보
        // 바위 > 가위
        // 보 > 바위
        else if ((Objects.equals(chrps, "가위") && Objects.equals(yorps, "보")) ||
                (Objects.equals(chrps, "바위") && Objects.equals(yorps, "가위")) ||
                (Objects.equals(chrps, "보") && Objects.equals(yorps, "바위"))) {

            System.out.println("철수가 이겼습니다");
        }

        // 위의 경우가 모두 아니면 영희 승리
        else {
            System.out.println("영희가 이겼습니다");
        }

        // Scanner 사용 끝나면 닫기
        scanner.close();
    }

    // 묵찌빠를 가위바위보로 변환하는 함수
    // 잘못된 입력이면 null 반환
    public static String convert(String input) {

        // 가위 또는 찌 입력하면 가위로 변환
        if (input.equals("가위") || input.equals("찌"))
            return "가위";

            // 바위 또는 묵 입력하면 바위로 변환
        else if (input.equals("바위") || input.equals("묵"))
            return "바위";

            // 보 또는 빠 입력하면 보로 변환
        else if (input.equals("보") || input.equals("빠"))
            return "보";

            // 가위/바위/보/묵/찌/빠가 아니면 잘못된 입력 -> null
        else
            return null;
    }
}