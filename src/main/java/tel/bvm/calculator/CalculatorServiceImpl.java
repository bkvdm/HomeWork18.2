package tel.bvm.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String greeting() {
        return "Добро пожаловать " + "Нужно выбрать раздел меню, набрав в адресной строке: /menu";
    }

    public String menu() {
        return "Для выбора калькулятора введите в адресную строку /menu/calculator";
    }

    public String calculator() {
        return "Калькулятор: " + "Нужно ввести в адресную строку значения: /menu/calculator/anyvalues, дополнив значениями переменных с указанием требуемого действия, например: http://localhost:8080/menu/calculator/anyvalues?valueone=300&action=умножить&valuetwo=200";
    }

    public String valuesActions(Float anyValueOne, String anyAction, Float anyValueTwo) {
        Float result = null;
        Float[] values = {anyValueOne, anyValueTwo};
        String plus = "плюс";
        String minus = "минус";
        String multiply = "умножить";
        String divide = "делить";
        String resultString = null;
        boolean noNull = anyValueOne != null && anyValueTwo != null;
        boolean rightAction = anyAction.equals(plus) || anyAction.equals(minus) || anyAction.equals(multiply) || anyAction.equals(divide);
        boolean divisionCondition = anyAction.equals(divide) && anyValueTwo != 0;

        if (noNull && rightAction) {

            if (anyAction.equals(plus)) {
                for (int i = 0; i < values.length - 1; i++) {
                    if (i > 0) {
                        result = result + values[i] + values[i + 1];
                    } else {
                        result = values[i] + values[i + 1];
                    }
                    resultString = anyValueOne + " + " + anyValueTwo + " = " + result;
                }
            } else if (anyAction.equals(minus)) {
                for (int i = 0; i < values.length - 1; i++) {
                    if (i > 0) {
                        result = result - values[i] - values[i + 1];
                    } else {
                        result = values[i] - values[i + 1];
                    }
                    resultString = anyValueOne + " - " + anyValueTwo + " = " + result;
                }
            } else if (anyAction.equals(multiply)) {
                for (int i = 0; i < values.length - 1; i++) {
                    if (i > 0) {
                        result = result * values[i] * values[i + 1];
                    } else {
                        result = values[i] * values[i + 1];
                    }
                    resultString = anyValueOne + " * " + anyValueTwo + " = " + result;
                }
            } else if (divisionCondition) {
                for (int i = 0; i < values.length - 1; i++) {
                    if (i > 0) {
                        result = result / values[i] / values[i + 1];
                    } else {
                        result = values[i] / values[i + 1];
                    }
                    resultString = anyValueOne + " / " + anyValueTwo + " = " + result;
                }
            } else {
                resultString = "Недопустимое значение делителя равным нулю. На ноль делить нельзя";
            }
        } else if (rightAction == false) {
            resultString = "Результат не может быть рассчитан. Действие над значениями должно быть указано, как: плюс, минус, умножить, делить";
        } else if (noNull == false) {
            resultString = "Для расчёта необходимо указать числовые значения переменных";
        }
        return resultString;
    }
}