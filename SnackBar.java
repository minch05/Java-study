import java.util.Scanner; // 키보드 입력을 받기 위한 Scanner 클래스

public class SnackBar {
    public static void main(String[] args) { // main 메소드 (프로그램 시작점)
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        // 안내 문구 출력
        System.out.println("**** 자바분식입니다. 주문하면 금액을 알려드립니다. ****");

        // 떡볶이 인분 입력 받기
        System.out.print("떡볶이 몇 인분 >> ");
        int tteok = scanner.nextInt(); // 입력받은 값을 tteok 변수에 저장

        // 김말이 인분 입력 받기
        System.out.print("김말이 몇 인분 >> ");
        int gim = scanner.nextInt();   // 입력받은 값을 gim 변수에 저장

        // 쫄면 인분 입력 받기
        System.out.print("쫄면 몇 인분 >> ");
        int jjol = scanner.nextInt();  // 입력받은 값을 jjol 변수에 저장

        // 각 메뉴 가격 계산 (인분 * 가격)
        int tteokprice = tteok * 2000; // 떡볶이: 2000원
        int gimprice = gim * 1000;     // 김말이: 1000원
        int jjolprice = jjol * 3000;   // 쫄면: 3000원 (오타 수정: jjolpricd → jjolprice)

        // 전체 금액 계산
        int totalprice = tteokprice + gimprice + jjolprice;

        // 최종 결과 출력
        System.out.println("전체 금액은 " + totalprice + "원입니다.");

        scanner.close(); // Scanner 종료 (자원 해제)
    }
}