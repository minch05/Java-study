import java.util.Scanner; // 입력 받기
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학점을 입력하세요>>");
        String grade = scanner.nextLine(); // 문자열 입력

        switch (grade) {
            case "A+":
            case "A":
                System.out.println("Excellent");
                break; // A학점

            case "B+":
            case "B":
                System.out.println("Good");
                break; // B학점

            case "C+":
            case "C":
            case "D":
                System.out.println("Study More");
                break; // C, D

            case "F":
                System.out.println("See You");
                break; // F

            default:
                System.out.println("잘못 입력"); // 예외 처리
        }

        scanner.close(); // 자원 정리$
    }
}