package tel.bvm.calculator;

public interface CalculatorService {
    String greeting();

    String menu();

    String calculator();

    String valuesActions(float anyValueOne, String anyAction, float anyValueTwo);
}
