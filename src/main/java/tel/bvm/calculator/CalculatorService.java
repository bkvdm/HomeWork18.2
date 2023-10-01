package tel.bvm.calculator;

public interface CalculatorService {
    String greeting();

    String menu();

    String calculator();

    String valuesActions(Float anyValueOne, String anyAction, Float anyValueTwo);

    public String actionMethod();

    public String plus(Float one, Float two);

    public String minus(Float one, Float two);

    public String multiply(Float one, Float two);

    public String divide(Float one, Float two);
}