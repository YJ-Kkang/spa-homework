//계산과 관련한 모든 작업 담당하는 클래스


package Week4HomeWork;

import java.util.ArrayList;  //리스트 자료구조를 사용하기 위해 추가
import java.util.List; //리스트 인터페이스를 사용하기 위해 추가

public class Calculator {
    //계산 결과를 저장할 results 리스트 선언
    private List<Double> results = new ArrayList<>();

    /*
    calculate 메서드
    두 숫자(num1, num2)와 연산자(operator)를 받아 계산을 수행함
     */
    public double calculate(int num1, int num2, char operator) {
        //계산 결과를 담기 위해 result 변수를 선언함.
        double result = 0;

        //사칙연산 수행
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                //0으로 나누는 경우 오류를 방지하기 위해 NaN(Not a Number)을 반환
                System.out.println("0은 분모가 될 수 없습니다.");
                return Double.NaN;
            }
            result = (double) num1 / num2;
        } else {
            //연산자가 잘못되었을 경우, 오류 메시지를 출력하고 NaN을 반환
            System.out.println("유효하지 않은 연산자입니다.");
            return Double.NaN;
        }

        //계산 결과를 리스트에 저장한 뒤 반환
        results.add(result); //계산 결과를 리스트에 저장
        return result; //결과 반환
    }

    //계산 결과 리스트를 반환
    //새로운 리스트를 만들어 반환하기 때문에 원본을 안전하게 보호할 수 있음
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }
}
