# Calculator Project
스파르타 내일배움캠프 Spring 4기 과제에 사용한 코드입니다. Java를 이용하여 클래스 없이 기본적인 연산을 수행할 수 있는 계산기(Lv 1), 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기(Lv 2)를 구현하였습니다.

<br>

## 🧑‍🏫 프로젝트 소개
- 이 프로젝트는 콘솔 기반의 기본적인 사칙연산을 수행할 수 있는 계산기 프로그램입니다.
- 사용자의 입력을 받아 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 수행하고 그 결과를 출력합니다.   

<br>

## 🕰️ 개발 기간

\- **2024. 11. 11. (월) ~ 2024. 11. 20. (수)**

\- 공부 기간: 2024. 11. 11. (월) ~ 2024. 11. 14. (목)

\- 개발 기간: 2024. 11. 14. (목) ~ 2024. 11. 20. (수)

<br>

## 🐣 개발자 소개

- 강유진

<img src="https://raw.githubusercontent.com/YJ-Kkang/spa-homework/refs/heads/main/images/yujin.webp" alt="title" width="300"/>

  [Git 링크](https://github.com/YJ-Kkang)

  [블로그 링크](https://velog.io/@yjkang/posts)

  
<br>

## 💬 요구 사항 정의
1. **계산기 기능**
    - 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈)
    - `0으로 나누기` 시도하면 '0으로 나눌 수 없습니다. 다시 시도해 주세요.' 출력.

2. **사용자 인터페이스 방식**: 콘솔 기반

<br>

## 📝 설계
1. **클래스 다이어그램**: 계산기에 필요한 클래스를 설계.
- `Input`: 숫자와 연산자 입력.
- `Calculator`: 입력 값 저장 및 연산, 연산한 결과 저장.
- `App`: 계산 수행한 결과 프린트.

2. **기능 분해**: 주요 기능을 메소드로 분리.
- `add()`: 덧셈을 수행하는 메소드.
- `sub()`: 뺄셈을 수행하는 메소드.
- `mul()`: 곱셈을 수행하는 메소드.
- `div()`: 나눗셈을 수행하는 메소드. (`0으로 나누기` 시도 시, 예외 처리)

3. **데이터 흐름 설계**: 데이터가 클래스 간에 어떻게 흐를지를 결정.
- 입력: `Input` 클래스에서 사용자가 콘솔에 수식 입력.
- 처리: 입력된 수식을 `Calculator` 클래스의 메소드를 사용해 연산을 수행.
- 출력: 결과를 `App` 클래스를 통해 콘솔에 출력.


<br>

## 🛠 설치 방법   
1. Java Development Kit (JDK)를 설치합니다. → [Window](https://teamsparta.notion.site/Window-JDK-f646c4cfdbd34daf81b4315f7abeba1d)    / [Mac](https://teamsparta.notion.site/Mac-JDK-cd42768710404e50a742ce0e187975bf)
2. 이 레포지토리를 클론합니다.
```
bash git clone https://github.com/YJ-Kkang/spa-homework.git .
```
3. 프로그램을 실행합니다.

<br>

## 🔍 사용 방법
1. 프로그램이 실행되면, 첫 번째 양의 정수를 입력합니다.
2. 사칙연산 기호(+, -, *, /) 중 하나를 입력합니다.
3. 두 번째 양의 정수를 입력합니다.
4. 연산 결과가 출력됩니다.
5. 추가로 계산을 하고 싶다면 계속해서 입력합니다.
6. 종료하려면 `exit`을 입력합니다.

<br>

## 📚 사용 예시
![title](https://github.com/YJ-Kkang/spa-homework/blob/main/images/1.png?raw=true)   
<img src="https://github.com/YJ-Kkang/spa-homework/blob/main/images/2.png?raw=true" alt="title" width="333"/>   
![title](https://github.com/YJ-Kkang/spa-homework/blob/main/images/3.png?raw=true)   


<br>

## 📨 문의 사항
Yujin Kang - kyujin995@gmail.com

Project Link: https://github.com/YJ-Kkang/spa-homework.git
