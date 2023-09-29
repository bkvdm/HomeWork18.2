package tel.bvm.calculator;

public class CalculatorServiceImpl implements CalculatorService {

    public String greeting() {
        return "<b>Добро пожаловать<b>" + "Нужно выбрать раздел меню, набрав в адресной строке: /menu";
    }

    public String menu() {
        return "Для выбора калькулятора введите в адресную строку /menu/calculator";
    }

    public String calculator() {
        return "</b>Калькулятор:</b> " + "Нужно ввести в адресную строку значения: /menu/calculator/values";
    }
    public Float valuesPlus(float anyValueOne, float anyValuesTwo) {
//        float[] values = {anyValueOne, anyValueOne};
        float sum = anyValueOne + anyValuesTwo;
        return sum;
    }
}
