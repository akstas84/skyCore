package sky.spring.calc.services;

public interface CalcService {

    String welcomeToCalculator();

    Integer calcPlus(Integer num1, Integer num2);

    Integer calcMinus(Integer num1, Integer num2);

    Integer calcMultiply(Integer num1, Integer num2);

    Integer calcDivide(Integer num1, Integer num2);

}
