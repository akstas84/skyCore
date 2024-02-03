package sky.spring.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sky.spring.calc.services.CalcServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SkySpringCalcApplicationParametrizedTests {

    CalcServiceImpl calcServiceImpl;

    @BeforeEach
    void before() {
        calcServiceImpl = new CalcServiceImpl();
    }

    @ParameterizedTest
    @MethodSource("provideParamsForWelcomeMethTests")
    void welcomeToCalculator(String expected) {
        String actualWelcomeStr = calcServiceImpl.welcomeToCalculator();
        assertEquals(expected, actualWelcomeStr);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMathMethTests")
    void calcPlus(Integer num1, Integer num2) {
        Integer expected = num1 + num2;
        Integer actual = calcServiceImpl.calcPlus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMathMethTests")
    void calcMinus(int num1, int num2) {
        Integer expected = num1 - num2;
        Integer actual = calcServiceImpl.calcMinus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMathMethTests")
    void calcMultiply(int num1, int num2) {
        Integer expected = num1 * num2;
        Integer actual = calcServiceImpl.calcMultiply(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMathMethTests")
    void calcDivide(int num1, int num2) {
        Integer expected = num1 / num2;
        Integer actual = calcServiceImpl.calcDivide(num1, num2);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParamsForWelcomeMethTests() {
        return Stream.of(
                Arguments.of("<b>Добро пожаловать в калькулятор</b>")
        );
    }

    public static Stream<Arguments> provideParamsForMathMethTests() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(2, 0)
        );
    }

}
