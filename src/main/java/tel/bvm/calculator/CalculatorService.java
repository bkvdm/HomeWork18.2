package tel.bvm.calculator;

public interface CalculatorService {
    String greeting();

    String menu();

    String calculator();

    String valuesActions(Float anyValueOne, String anyAction, Float anyValueTwo);
}