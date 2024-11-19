package Lv2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Input input = new Input();

        String ans = "";

        while (!ans.equals("exit")) {
            int num1 = input.getNumber("첫 번째 양의 정수 n을 입력하세요: ");
            char operator = input.getOperator("사칙연산 기호(+, -, *, /) 중 하나를 입력하세요: ");
            int num2 = input.getNumber("두 번째 양의 정수 n을 입력하세요: ");

            double result = calculator.calculate(num1, num2, operator);
            if (!Double.isNaN(result)) {
                System.out.println("결과: " + result);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            Scanner sc = new Scanner(System.in);
            ans = sc.next();
        }

        System.out.println("저장된 연산 결과들: " + calculator.getResults());
    }
}
