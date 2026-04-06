import java.util.Scanner;
import java.util.InputMismatchException; // 입력 오류 처리

public class WatermelonPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 키보드 입력 객체 생성

        try {
            System.out.print("몇 개>>");

            int count = scanner.nextInt(); // 수박 개수 입력

            // 음수 입력 방지
            if (count <= 0) {
                System.out.println("1개 이상 입력하세요.");
                return; // 프로그램 종료
            }

            int price = 5000; // 수박 1개의 가격
            int total = 0;    // 최종 가격 저장 변수

            // 1개 구매 (할인 없음)
            if (count == 1) {
                total = price;
            }
            // 2개 구매 (10% 할인)
            else if (count == 2) {
                total = (int)(price * 2 * 0.9);
            }
            // 3개 구매 (20% 할인)
            else if (count == 3) {
                total = (int)(price * 3 * 0.8);
            }
            // 4개 구매 (30% 할인)
            else if (count == 4) {
                total = (int)(price * 4 * 0.7);
            }
            // 5개 이상 구매
            else {
                // 4개는 30% 할인 적용
                int discounted = (int)(price * 4 * 0.7);

                // 나머지는 정가 계산
                int normal = (count - 4) * price;

                // 최종 가격 = 할인 + 정가
                total = discounted + normal;
            }

            // 결과 출력
            System.out.println("최종 가격은 " + total + "원입니다.");

        } catch (InputMismatchException e) {
            // 숫자가 아닌 값 입력 시 처리
            System.out.println("숫자만 입력하세요.");
        }

        scanner.close(); // 자원 해제
    }
}