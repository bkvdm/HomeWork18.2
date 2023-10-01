package tel.bvm.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String greating() {
        return calculatorService.greeting();
    }

    @GetMapping(path = "/menu")
    public String menu() {
        return calculatorService.menu();
    }

    @GetMapping(path = "/menu/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/menu/calculator/anyvalues")
    public String valuesActions(@RequestParam(value = "valueone", required = false) Float anyValueOne, @RequestParam("action") String anyAction, @RequestParam(value = "valuetwo", required = false) Float anyValueTwo) {
//        required = false RequestParam
        return calculatorService.valuesActions(anyValueOne, anyAction, anyValueTwo);
    }

    @GetMapping(path = "/menu/calculator/actionmethod")
    public String actionMethod() {
        return calculatorService.actionMethod();
    }

    @GetMapping(path = "/menu/calculator/actionmethod/plus")
    public String plus(@RequestParam(value = "variableone", required = false) Float one, @RequestParam(value = "variabletwo", required = false) Float two) {
        return calculatorService.plus(one, two);
    }

    @GetMapping(path = "/menu/calculator/actionmethod/minus")
    public String minus(@RequestParam(value = "variableone", required = false) Float one, @RequestParam(value = "variabletwo", required = false) Float two) {
        return calculatorService.minus(one, two);
    }

    @GetMapping(path = "/menu/calculator/actionmethod/multiply")
    public String multiply(@RequestParam(value = "variableone", required = false) Float one, @RequestParam(value = "variabletwo", required = false) Float two) {
        return calculatorService.multiply(one, two);
    }

    @GetMapping(path = "/menu/calculator/actionmethod/divide")
    public String divide(@RequestParam(value = "variableone", required = false) Float one, @RequestParam(value = "variabletwo", required = false) Float two) {
        return calculatorService.divide(one, two);
    }

}