package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 계산기 객체 생성
        Calculator<Double> calculator = new Calculator<>();

        while (true){
            // 수식 입력
            try {
                System.out.print("첫 번째 숫자 입력: ");
                double a = scanner.nextDouble();
                System.out.print("연산 기호 입력(+, -, *, /): ");
                char operator = scanner.next().charAt(0);
                System.out.print("두번째 숫자 입력: ");
                double b = scanner.nextDouble();

                Operator op = Operator.fromChar(operator);
                try {
                    calculator.calculate(a, b, op);
                    double result = calculator.getResult();
                    System.out.println(a + " " + operator + " " + b + " = " + result);

                    ArrayList<Double> results = calculator.getResultsGreaterThan(result);
                    if (!results.isEmpty()) {
                        System.out.println(result+"보다 더 큰 수: "+results);
                    }
                }catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다!");
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
