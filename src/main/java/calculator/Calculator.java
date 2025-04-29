package calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> history = new ArrayList<>();

    public void calculate(int a, int b, char operator) throws ArithmeticException {
        if (operator == '+') {
            history.add(a + b);
        } else if (operator == '-') {
            history.add(a - b);
        } else if (operator == '*') {
            history.add(a * b);
        } else if (operator == '/') {
            history.add(a / b);
        }
    }

    public int getResult() {
        return history.get(history.size()-1);
    }

    public void setResult(int value) {
        if (!history.isEmpty()) {
            int lastIndex = history.size() - 1;
            history.set(lastIndex, value);
        }
    }

}
