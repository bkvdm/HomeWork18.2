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

    @GetMapping(path = "/menu/calculator/valuesplus")
    public Float valuesPlus(@RequestParam("valueone") float anyValueOne, @RequestParam("valuetwo") float anyValueTwo) {
        return calculatorService.valuesPlus(anyValueOne, anyValueTwo);
    }
}

