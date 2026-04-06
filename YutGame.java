import java.util.Scanner;
import java.util.InputMismatchException;

public class YutGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 입력 객체 생성

        try {
            System.out.print("윷 결과 입력 (0 또는 1 네 개)>>");

            // 4개의 입력 받기
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

            // 개수에 따라 결과 출력
            if (count == 0) {
                System.out.println("모");
            } else if (count == 1) {
                System.out.println("도");
            } else if (count == 2) {
                System.out.println("개");
            } else if (count == 3) {
                System.out.println("걸");
            } else {
                System.out.println("윷");
            }

        } catch (InputMismatchException e) {
            // 숫자 아닌 입력 처리
            System.out.println("숫자만 입력하세요.");
        }

        scanner.close();
    }
}