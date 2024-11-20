package Lv2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Calculator 클래스의 객체 생성
        Calculator calculator = new Calculator();
        //Input 클래스의 객체 생성
        Input input = new Input();

        String ans = "";

        //반복문
        while (!ans.equals("exit")) {
            //Input 객체의 getNumber, getOperator 메서드 호출, 정수와 연산자 입력받음
            int num1 = input.getNumber("첫 번째 양의 정수 n을 입력하세요: ");
            char operator = input.getOperator("사칙연산 기호(+, -, *, /) 중 하나를 입력하세요: ");
            int num2 = input.getNumber("두 번째 양의 정수 n을 입력하세요: ");

            //Calculator 객체의 calculate 메서드 호출, 계산 수행 및 결과 츌력.
            //결과가 유효하지 않은 경우 NaN 반환.
            double result = calculator.calculate(num1, num2, operator);
            //result가 유효한 숫자인 경우에만 결과를 출력 (result가 NaN면, 결과 출력 X)
            if (!Double.isNaN(result)) {
                System.out.println("결과: " + result);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            Scanner sc = new Scanner(System.in);
            ans = sc.next();
        }

        //저장된 연산 결과들 출력, 프로그램 종료
        System.out.println("저장된 연산 결과들: " + calculator.getResults());
    }
}
