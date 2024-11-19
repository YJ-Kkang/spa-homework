package Lv2;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //숫자 입력(숫자를 입력받는 메서드 getNumber)
    public int getNumber(String prompt) {
        System.out.print(prompt);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("음의 정수는 입력할 수 없습니다. 계산기를 종료합니다.");
            System.exit(1); // 프로그램 종료
        }
        return number; //입력된 숫자 반환
    }

    //연산자 입력
    public char getOperator(String prompt) {
        System.out.print(prompt);
        char operator = scanner.next().charAt(0);
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("유효하지 않은 연산자입니다.");
            System.exit(1); // 프로그램 종료
        }
        return operator; //입력된 연산자 반환
    }
}
