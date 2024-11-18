package Lv1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        String ans = "";

        // 반복문 사용해서 연산 반복
        while (!ans.equals("exit")) {

            // 첫 번째 양의 정수 입력
            System.out.print("첫 번째 양의 정수 n을 입력하세요: ");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("음의 정수는 입력할 수 없습니다. 계산기를 종료합니다.");
                break;
            }

            sc.nextLine(); // 버퍼 초기화

            // 사칙연산 기호 입력
            System.out.print("사칙연산 기호(+, -, *, /) 중 하나를 입력하세요: ");
            String oper = sc.next();

            // 두 번째 양의 정수 입력
            System.out.print("두 번째 양의 정수 n을 입력하세요: ");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("음의 정수는 입력할 수 없습니다. 계산기를 종료합니다.");
                break;
            }

            double result = 0;

            switch (oper) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    } else {
                        result = (double) num1 / num2;
                    }
                    break;
                default:
                    System.out.println("유효하지 않은 연산자입니다.");
                    continue;
            }

            System.out.println("결과: " + result);

            // exit을 입력 받으면 반복 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            ans = sc.next();

            if (ans.equalsIgnoreCase("exit")) {
                System.out.println("계산기가 종료되었습니다. 감사합니다.");
                break;
            }
        }
    }
}
