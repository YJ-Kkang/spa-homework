//사용자가 잘못된 입력을 넣었을 때 예외를 던지는 역할을 하는 클래스

package Week4HomeWork;

/*
Exception 클래스를 상속하여 새로운 예외를 정의
예외 메시지로 "잘못된 입력입니다!"와 함께 안내 메시지 출력
 */
public class BadInputException extends Exception {
    public BadInputException(String type) {
        super("잘못된 입력입니다! " + type + "를 입력해주세요!");
    }
}
