package Lv2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //연산 결과 저장할 리스트 선언
    private List<Double> results = new ArrayList<>();

    //두 정수와 연산자를 받아 계산을 수행하는 메서드
    public double calculate(int num1, int num2, char operator) {
        double result = 0;

        //연산 수행
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("0은 분모가 될 수 없습니다.");
                //0으로 나누기 시도 시 예외 처리
                /* NaN은 수학적으로 정의되지 않은 연산의 결과를 나타내기 위해 사용하는 특수한 값
                주로 실수 연산에서 사용되기에 double 또는 float 타입에 속함 */
                return Double.NaN;
            }
            //입력을 다 int로 받았기에 result 값 출력할 때는 형 변환
            result = (double) num1 / num2;
        } else {
            System.out.println("유효하지 않은 연산자입니다.");
            //잘못된 연산자 입력 시 예외 처리
            return Double.NaN;
        }

        //연산 결과 리스트에 추가
        results.add(result);
        return result;
    }

    //결과 리스트 반환
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }
}
