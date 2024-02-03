package sky.spring.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sky.spring.calc.exceptions.DivideArgumentException;
import sky.spring.calc.services.CalcServiceImpl;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SkySpringCalcApplicationTests {

    CalcServiceImpl calcServiceImpl;

    @BeforeEach
    void before() {
        calcServiceImpl = new CalcServiceImpl();
    }

    @Test
    void welcomeToCalculator() {
        String expectedWelcomeStr = "<b>Добро пожаловать в калькулятор</b>";
        String actualWelcomeStr = calcServiceImpl.welcomeToCalculator();
        assertEquals(expectedWelcomeStr, actualWelcomeStr);
    }

    @Test
    void calcPlus() {
        Integer num1 = 5;
        Integer num2 = 6;
        Integer expected = num1 + num2;
        Integer actual = calcServiceImpl.calcPlus(num1, num2);
        assertEquals(expected, actual);
        Integer num3 = 7;
        Integer num4 = 8;
        Integer expectedSec = num3 + num4;
        Integer actualSec = calcServiceImpl.calcPlus(num3, num4);
        assertEquals(expectedSec, actualSec);
    }

    @Test
    void calcMinus() {
        Integer num1 = 5;
        Integer num2 = 6;
        Integer expected = num1 - num2;
        Integer actual = calcServiceImpl.calcMinus(num1, num2);
        assertEquals(expected, actual);
        Integer num3 = 7;
        Integer num4 = 8;
        Integer expectedSec = num3 - num4;
        Integer actualSec = calcServiceImpl.calcMinus(num3, num4);
        assertEquals(expectedSec, actualSec);
    }

    @Test
    void calcMultiply() {
        Integer num1 = 5;
        Integer num2 = 6;
        Integer expected = num1 * num2;
        Integer actual = calcServiceImpl.calcMultiply(num1, num2);
        assertEquals(expected, actual);
        Integer num3 = 7;
        Integer num4 = 8;
        Integer expectedSec = num3 * num4;
        Integer actualSec = calcServiceImpl.calcMultiply(num3, num4);
        assertEquals(expectedSec, actualSec);
    }

    @Test
    void calcDivide() {
        Integer num1 = 5;
        Integer num2 = 6;
        Integer expected = num1 / num2;
        Integer actual = calcServiceImpl.calcDivide(num1, num2);
        assertEquals(expected, actual);
        Integer num3 = 7;
        Integer num4 = 8;
        Integer expectedSec = num3 / num4;
        Integer actualSec = calcServiceImpl.calcDivide(num3, num4);
        assertEquals(expectedSec, actualSec);
    }

    @Test()
    void calcDivideExceptionTest() {
        Integer num1 = 5;
        Integer num2 = 0;

        boolean exceptionThrown = false;
        try {
            calcServiceImpl.calcDivide(num1, num2);
        } catch (DivideArgumentException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test()
    public void testMethodThrowsException() throws DivideArgumentException {
        Integer num1 = 5;
        Integer num2 = 0;
        Throwable thrown = assertThrows(DivideArgumentException.class, () -> {
            calcServiceImpl.calcDivide(num1, num2);
        });
    }

}
