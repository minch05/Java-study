import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        // Scanner 객체 생성 (키보드 입력 받기)
        Scanner scanner = new Scanner(System.in);

        // 두 정수 입력 안내
        System.out.print("두 정수를 입력하세요>>");

        // 정수 두 개 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 합 출력
        System.out.println(a + "+" + b + "=" + (a + b));

        // 차 출력
        System.out.println(a + "-" + b + "=" + (a - b));

        // 곱 출력
        System.out.println(a + "*" + b + "=" + (a * b));

        // Scanner 닫기
        scanner.close();
    }
}