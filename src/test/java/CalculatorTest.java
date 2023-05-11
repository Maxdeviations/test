import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

        @BeforeAll
        static void BeforeAll(){
        }

        @AfterAll
        static void AfterAll(){
        }

        @BeforeEach
        void BeforeEach(){
            calculator = new Calculator();
        }

        @AfterEach
        void AfterEach(){
        }

        @Test
        void addition() {
            double value1 = 2;
            double value2 = 3;
            double expect = 5;
            double result = Calculator.addition(String.valueOf(value1), String.valueOf(value2));
            Assertions.assertEquals(expect, result);
        }

        @Test
        void subtraction() {
            double value1 = 10;
            double value2 = 6;
            double expect = 4;
            double result = Calculator.subtraction(String.valueOf(value1), String.valueOf(value2));
            Assertions.assertEquals(expect, result);
        }

        @Test
        void multyplyng() {
            double value1 = 2;
            double value2 = 3;
            double expect = 6;
            double result = Calculator.multyplyng(String.valueOf(value1), String.valueOf(value2));
            Assertions.assertEquals(expect, result);
        }

        @Test
        void division() {
            double value1 = 8;
            double value2 = 2;
            double expect = 4;
            double result = Calculator.division(String.valueOf(value1), String.valueOf(value2));
            Assertions.assertEquals(expect, result);
        }
    }