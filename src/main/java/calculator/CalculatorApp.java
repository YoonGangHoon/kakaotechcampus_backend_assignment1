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
                System.out.print("연산 기호 입력(+, -, *, /): ");
                char operator = scanner.next().charAt(0);
                System.out.print("두번째 숫자 입력: ");
                int b = scanner.nextInt();

                Calculator calculator = new Calculator();
                try {
                    calculator.calculate(a, b, operator);
                    System.out.println(a + " " + operator + " " + b + " = " + calculator.getResult());
                }catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }

            } catch (Exception e) {
                System.out.println("올바르지 않은 수식입니다.");
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
