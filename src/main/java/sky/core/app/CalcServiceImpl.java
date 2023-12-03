package sky.core.app;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String welcomeToCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public Integer calcPlus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer calcMinus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer calcMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer calcDivide(Integer num1, Integer num2) {
        return num1 / num2;
    }

}
