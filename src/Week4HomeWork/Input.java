package Week4HomeWork;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    //Input 클래스의 생성자. Scanner 객체를 초기화
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //숫자 입력(숫자를 입력받는 메서드 getNumber)
    public int getNumber(String prompt) {
        System.out.print(prompt);
        int number = scanner.nextInt();
        if (number < 0) {
            // 음의 정수 입력 시 프로그램 종료
            /*System.exit(1);는 자바 프로그램에서 현재 실행 중인 Java Virtual Machine(JVM)을 종료하는 명령.
            이 코드는 프로그램을 즉시 종료하고, 종료 상태 코드 반환(0이면 정상 종료, 1 또는 다른 양수 값이면 오류 또는 비정상 종료) */
            System.out.println("음의 정수는 입력할 수 없습니다. 계산기를 종료합니다.");
            System.exit(1);
        }
        //입력된 숫자 반환
        return number;
    }

    //연산자 입력(연산자를 입력받는 메서드 getOperator)
    public char getOperator(String prompt) {
        System.out.print(prompt);
        char operator = scanner.next().charAt(0);
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            // 잘못된 연산자 입력 시 프로그램 종료
            System.out.println("유효하지 않은 연산자입니다.");
            System.exit(1);
        }
        //입력된 연산자 반환
        return operator;
    }
}
