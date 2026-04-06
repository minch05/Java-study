import java.util.Scanner;
import java.util.InputMismatchException;

public class YutSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 입력 객체 생성

        try {
            System.out.print("윷 결과 입력 (0 또는 1 네 개)>>");

            // 입력 받기
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            // 0과 1만 허용
            if ((a != 0 && a != 1) || (b != 0 && b != 1) ||
                    (c != 0 && c != 1) || (d != 0 && d != 1)) {

                System.out.println("0 또는 1만 입력하세요.");
                return;
            }

            // 1의 개수 계산
            int count = a + b + c + d;

            // switch로 결과 출력
            switch (count) {
                case 0:
                    System.out.println("모");
                    break;
                case 1:
                    System.out.println("도");
                    break;
                case 2:
                    System.out.println("개");
                    break;
                case 3:
                    System.out.println("걸");
                    break;
                case 4:
                    System.out.println("윷");
                    break;
            }

        } catch (InputMismatchException e) {
            // 숫자 아닌 입력 처리
            System.out.println("숫자만 입력하세요.");
        }

        scanner.close();
    }
}