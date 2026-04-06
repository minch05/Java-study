import java.util.Scanner; // 사용자 입력을 받기 위한 클래스

public class Build {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        // 한 층의 높이 입력 (예: 3.5m)
        System.out.print("한층의 높이를 입력하세요(단위:미터) >>");
        double floorHeight = scanner.nextDouble();

        // 건물 전체 높이 입력 (정수로 입력)
        System.out.print("빌딩의 높이를 입력하세요 (단위: 미터) >>");
        int buildingHeight = scanner.nextInt();

        // 최대 층수 계산 (전체 높이 ÷ 한 층 높이)
        double maxFloors = buildingHeight / floorHeight;

        // 소수점 제거 후 출력 (층수는 정수이므로 형변환)
        System.out.println("최대 " + (int)maxFloors + "층까지 지을 수 있습니다.");

        scanner.close(); // 자원 해제
    }
}