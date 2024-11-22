//사용자의 입력을 읽고 해석(Parsing)하여 숫자와 연산자로 변환하는 클래스


package Week4HomeWork;

import java.util.regex.Pattern;

public class Parser {
    //정규식을 사용하여 연산자와 숫자가 올바른지 확인
    //+, -, *, / 중 하나만 허용
    private static final String OPERATION_REG = "[+\\-*/]";
    //숫자만 입력 가능
    /*
    ^[0-9]*$에서 ^는 문자열의 시작을, $은 문자열의 끝을 나타냄
    대괄호 안의 0-9는 숫자 중 하나라는 뜻으로, 이 위치에 숫자가 와야 한다는 의미
    *은 앞의 요소 [0-9]가 0번 이상 반복될 수 있다는 의미
    즉, 문자열의 시작과 끝 사이에 0부터 9까지의 숫자만 포함될 수 있다는 뜻이 됨
     */
    private static final String NUMBER_REG = "^[0-9]*$";

    //Calculator 객체를 생성하여 사용하고, 사용자 입력을 저장할 변수(firstNum, secondNum, operator)를 선언
    private final Calculator calculator = new Calculator();
    private int firstNum;
    private int secondNum;
    private char operator;

    /*
    첫 번째 숫자를 읽고, 숫자가 맞는지 정규식(^[0-9]*$)으로 확인
    올바른 숫자가 아니면 예외(BadInputException)를 던진다
    숫자가 맞으면 firstNum에 저장
     */
    public Parser parseFirstNum(String firstInput) throws BadInputException {
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("숫자");
        }
        this.firstNum = Integer.parseInt(firstInput);
        return this;
    }

    //위와 똑같이 두 번째 숫자 정규식으로 확인
    public Parser parseSecondNum(String secondInput) throws BadInputException {
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("숫자");
        }
        this.secondNum = Integer.parseInt(secondInput);
        return this;
    }

    /*
    연산자를 읽고, 유효한 연산자인지 확인
    유효하지 않으면 예외(BadInputException)를 던진다
    유효하다면 operator에 저장
     */
    public Parser parseOperator(String operationInput) throws BadInputException {
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("연산자");
        }
        this.operator = operationInput.charAt(0);
        return this;
    }

    //Calculator 객체를 사용해 저장된 숫자와 연산자로 계산을 실행
    public double executeCalculator() {
        return calculator.calculate(this.firstNum, this.secondNum, this.operator);
    }

    // 추가: calculator 접근자 메서드
    public Calculator getCalculator() {
        return calculator;
    }
}
