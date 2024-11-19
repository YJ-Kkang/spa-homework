package Lv2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results = new ArrayList<>();

    public double calculate(int num1, int num2, char operator) {
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("0은 분모가 될 수 없습니다.");
                return Double.NaN;
            }
            result = (double) num1 / num2;
        } else {
            System.out.println("유효하지 않은 연산자입니다.");
            return Double.NaN;
        }

        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return new ArrayList<>(results);
    }
}
