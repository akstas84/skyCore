package sky.core.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private CalcServiceImpl calcServiceImpl;

    public CalcController(CalcServiceImpl calcServiceImpl) {
        this.calcServiceImpl = calcServiceImpl;
    }

    @GetMapping()
    public String welcomeToCalculator() {
        return calcServiceImpl.welcomeToCalculator();
    }

    @GetMapping(path = "/plus")
    public Integer calcPlus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calcServiceImpl.calcPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public Integer calcMinus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calcServiceImpl.calcMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public Integer calcMultiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calcServiceImpl.calcMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public Integer calcDivide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calcServiceImpl.calcDivide(num1, num2);
    }

}
