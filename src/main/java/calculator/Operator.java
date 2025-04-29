package calculator;

public enum Operator {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static Operator fromChar(char c) {
        for (Operator op : values()) {
            if (op.symbol == c) return op;
        }
        throw new IllegalArgumentException("유효하지 않은 연산자: " + c);
    }
}