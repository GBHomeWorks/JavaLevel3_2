import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CalcTest {
    private MainClass mainClass;

    @BeforeEach
    public void init() {
        mainClass = new MainClass();
    }

    @Test
    public void test1() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] returnArr = {5, 6, 7, 8, 9};
        Assertions.assertArrayEquals(returnArr, mainClass.newArr(arr));
    }
    @Test
    public void test2() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 4, 8, 9};
        int[] returnArr = {8, 9};
        Assertions.assertArrayEquals(returnArr, mainClass.newArr(arr));
    }
    // Получаем обработку исключения и вывод сообщения в косоль >>>
    @Test
    public void test3() {
        int[] arr = {0, 1, 2, 3, 0, 5, 6, 7, 8, 9};
        int[] returnArr = {};
        Assertions.assertArrayEquals(returnArr, mainClass.newArr(arr));
    }

//    public void test3() {
//        int arr[] = {0, 1, 2, 3, 0, 5, 6, 7, 8, 9};
//        int returnArr[] = {};
//        Assertions.assertEquals( returnArr , mainClass.newArr(arr));
//    }
//    @CsvSource({
//            "0, 1, 2, 3, 4, 5, 6, 7, 8, 9",
////            "1, 1, 2",
////            "2, 3, 5",
////            "7, 5, 12",
////            "12, 12, 24"
//    })
//    @ParameterizedTest
//    public void massTestAdd(String input, String expected) {
////        Assertions.assertEquals(result, mainClass.newArr(a));
//        int[] arr = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
//        String result = Arrays.toString(mainClass.newArr(arr));
//        Assertions.assertEquals(expected, result);
//    }
}
