//프로그램의 시작점, 사용자와 상호작용을 처리하는 클래스

package Week4HomeWork;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // 프로그램이 종료될 때까지 반복하기 위해 while문을 사용
        boolean calculateEnded = false;

        // 계산 작업을 수행하고 저장된 결과를 관리하는 Calculator 객체 생성
        Calculator calculator = new Calculator();
        // 사용자 입력을 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        while (!calculateEnded) {
            try {
                // Parser 객체를 생성하여 사용자 입력 처리
                Parser parser = new Parser();

                // 첫 번째 숫자를 입력받아 parseFirstNum 메서드로 처리
                System.out.println("첫번째 숫자를 입력해주세요!");
                String firstInput = scanner.nextLine(); // 사용자 입력
                parser.parseFirstNum(firstInput); // 숫자 유효성 검사 및 변환

                // 연산자를 입력받아 parseOperator 메서드로 처리
                System.out.println("연산자를 입력해주세요!");
                String operator = scanner.nextLine(); // 사용자 입력
                parser.parseOperator(operator); // 연산자 유효성 검사

                // 두 번째 숫자를 입력받아 parseSecondNum 메서드로 처리
                System.out.println("두번째 숫자를 입력해주세요!");
                String secondInput = scanner.nextLine(); // 사용자 입력
                parser.parseSecondNum(secondInput); // 숫자 유효성 검사 및 변환

                // 계산 수행 및 결과 출력
                double result = parser.executeCalculator(); // 계산 실행
                System.out.println("연산 결과 : " + result); // 결과 출력

                // Calculator 객체의 저장된 연산 결과를 출력
                System.out.println("저장된 연산 결과들: " + calculator.getResults());

                // 잘못된 입력이 들어오면 예외를 잡아 메시지 출력
            } catch (BadInputException e) {
                System.out.println(e.getMessage());
            }

            // 사용자에게 계속 계산할지 묻고, exit 입력 시 반복문 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (scanner.nextLine().equalsIgnoreCase("exit")) {
                calculateEnded = true; // 종료 조건
            }
        }
    }
}
