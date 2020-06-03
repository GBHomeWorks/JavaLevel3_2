import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest2 {
    MainClass2 mainClass2;

//    @BeforeEach
//    public void init() {
//        mainClass2 = new MainClass2();
//    }

    @Test
    public void test1() {
        mainClass2 = new MainClass2();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Assertions.assertArrayEquals(); ----- вызываемый метод класса MainTest2 возвращает
//        значение типа boolean. Но отсюда передавать следут только тип boolean.
//        Массив не передать.
//        Assertions.assertArrayEquals() возврвщает  тот же тип что и передает.
//        Пока не знаю как реализовать такую ак в задании задании порцедуру передачи
//        и возврата данных.
    }

//    @Test
//    public void test1() {
//        mainClass2 = new MainClass2();
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] returnArr = {5, 6, 7, 8, 9};
//        Assertions.assertEquals( returnArr , mainClass2.newArr(arr));
//    }
}
