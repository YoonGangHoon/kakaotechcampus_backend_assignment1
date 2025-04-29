package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        while (true){
            // 수식 입력
            try {
                System.out.print("첫 번째 숫자 입력: ");
                int a = scanner.nextInt();
                System.out.print("연산 기호 입력: ");
                char operator = scanner.next().charAt(0);
                System.out.print("두번째 숫자 입력: ");
                int b = scanner.nextInt();

                // 연산
                if (operator == '+') {
                    System.out.println("두 수의 합: " + (a + b));
                }
                else if (operator == '-') {
                    System.out.println("두 수의 차: " + (a - b));
                }
                else if (operator == '*') {
                    System.out.println("두 수의 곱: " + (a * b));
                }
                else if (operator == '/') {
                    try {
                        System.out.println("두 수의 합: " + (a / b));
                    } catch (ArithmeticException e) {
                        System.out.println("0으로는 나눌 수 없습니다.");
                    }
                }
                else {
                    System.out.println("정의된 연산 기호는 (+, -, *, /) 입니다.");
                }
            } catch (Exception e) {
                System.out.println("정수를 입력하십시오.");
                scanner.nextLine();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (scanner.next().equals("exit")) {
                break;
            }
        }
        scanner.close();
    }
}
