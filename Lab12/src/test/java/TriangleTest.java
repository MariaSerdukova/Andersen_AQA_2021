import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    TriangleFunction triangleFunction = new TriangleFunction();
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    static void beforeAll(){
        logger.info("Выполнится перед всеми тестами");
        //  System.out.println("Выполнится перед всеми тестами");
    }

    @BeforeEach
    void setUp(){
        logger.info("Выполнится перед каждым тестом");
        //System.out.println("Выполнится перед каждым тестом");
    }

    @Test
        //тест на корректное значение
    void testGivenEvenNumberWhenCheckIsEvenThenTrue(){
        boolean result= triangleFunction.main(2);
        Assertions.assertTrue(result);
    }
    @Test
    @RepeatedTest(10)
        //негативный кейс
    void testGivenOddNumberWhenCheckIsEvenThenFalse(){
        boolean result= triangleFunction.main(3);
        Assertions.assertFalse(result,"Проверяем, что число нечетное");
    }

    @Test
    @DisplayName("Проверить функцию, isNumberPositive положительным числом")
    void testIsNumberPositive(){
        Assertions.assertTrue(triangleFunction.main(1));
    }

    @Test
    void testIsPrimeFunctionWithNegativeNumber(){
        Assertions.assertFalse(triangleFunction.main(-1));
    }


    @AfterEach
    void tearDown(){
        logger.debug("Выполнится после каждого теста");
        //      System.out.println("Выполнится после каждого теста");
    }
    @AfterAll
    static void AfterAll(){
        logger.debug("Выполнится после всех тестов");
        //      System.out.println("Выполнится после всех тестов");
    }

}