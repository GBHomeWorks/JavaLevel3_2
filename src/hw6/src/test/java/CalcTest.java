//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class CalcTest {
//    private MainClass calculator;
//
//    @BeforeEach
//    public void init() {
//        calculator = new MainClass();
//    }
//
//    @ParameterizedTest
//    @MethodSource( "dataForAddOperation" )
////    @Timeout (value = 500, unit = TimeUnit.MILLISECONDS)
//    public void testAddOperation(int a, int b, int result) {
//        Assertions.assertEquals(result, calculator.add(a, b));
//    }
//    public static Stream<Arguments> dataForAddOperation() {
//        List<Arguments> out = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            int a = (int)(Math.random() * 1000);
//            int b = (int)(Math.random() * 1000);
//            int result = a + b;
//            out.add(Arguments.arguments(a, b, result));
//        }
//        return out.stream();
//    }
//}
