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

    public String valuesActions(float anyValueOne, String anyAction, float anyValueTwo) {
        float result = 0;
        float[] values = {anyValueOne, anyValueTwo};
        String plus = "+";
        String resultString = null;
        if (anyAction.equals(plus)) {
            for (int i = 0; i < values.length - 1; i++) {
                result = result + values[i] + values[i + 1];
                resultString = anyValueOne + " + " + anyValueTwo + " = " + result;
            }
        } else resultString = "Результат не может быть рассчитан. Нужно выбрать допустимое действие: +-*/" + result;
        return resultString;
    }
}

