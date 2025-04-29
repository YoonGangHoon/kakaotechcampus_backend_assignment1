package calculator;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Calculator<T extends Number> {

    private ArrayList<Double> history = new ArrayList<>();

    public void calculate(T a, T b, Operator op){
        double aDouble = a.doubleValue();
        double bDouble = b.doubleValue();
        switch (op) {
            case PLUS:
                history.add(aDouble+bDouble);
                break;
            case MINUS:
                history.add(aDouble - bDouble);
                break;
            case MULTIPLY:
                history.add(aDouble * bDouble);
                break;
            case DIVIDE:
                if (bDouble == 0){
                    throw new ArithmeticException();
                }
                else{
                    history.add(aDouble / bDouble);
                    break;
                }
        }
    }

    public double getResult() {
        return history.get(history.size()-1);
    }

    public void setResult(T value) {
        if (!history.isEmpty()) {
            int lastIndex = history.size() - 1;
            history.set(lastIndex, value.doubleValue());
        }
    }

    public ArrayList<Double> getResultsGreaterThan(T target) {
        return history.stream()
                .filter(n -> n.doubleValue() > target.doubleValue())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
