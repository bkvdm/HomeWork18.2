package tel.bvm.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String greeting() {
        return "Добро пожаловать " + "Нужно выбрать раздел меню, набрав в адресной строке: /menu";
    }

    public String menu() {
        return "Для выбора калькулятора введите в адресную строку /menu/calculator";
    }

    public String calculator() {
        return "Калькулятор: " + "Нужно ввести в адресную строку значения: /menu/calculator/anyvalues";
    }

    public String valuesActions(Float anyValueOne, String anyAction, Float anyValuesTwo) {
        float[] values = {anyValueOne, anyValueOne};
        Float result = null;
        if (anyAction.equals("+")) {
            for (int i = 0; i < values.length; i++) {
                result = values[i] + values[i + 1];
            }
        }
        String resultString;
        resultString = anyValueOne + " + " + anyValuesTwo + " = " + result;
        return resultString;
    }
}
