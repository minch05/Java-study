import java.util.Scanner;  // 입력용

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner 생성

        System.out.println("x값을 정수로 입력하세요 >> ");

        int x = scanner.nextInt();  // 정수 입력 받기

        // y = x^3 - 2x^2 + 3x + 10 (자바는 제곱 → x*x)
        int result = x*x*x - 2*x*x + 3*x + 10;

        // 결과 출력
        System.out.println("x가 " + x + "일때 , y는 " + result + "입니다.");

        scanner.close();  // 자원 정리
    }
}
