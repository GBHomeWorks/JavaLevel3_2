import java.util.ArrayList;

public class MainClass {
    public static boolean q;

        public int[] newArr ( int[] arr){
            int b = 0;          // --- длина нового массива subArr

            try {
                for (int i = arr.length - 1; arr[i] != 4; i--) {     // --- вычисление длины массива
                    b = arr.length - i;
                }
            } catch (IndexOutOfBoundsException e) {    // здесь ловим исключение подкласса RunTimeException
                b = 0;
                System.out.println("В массиве нет элемента со значением '4'");
            }

            int[] subArr = new int[b];       // ----- объявление  нового массива

            for (int i = 0; i < subArr.length; i++) {        // ---- формирование массива
                subArr[i] = arr[arr.length - b + i];
            }
            return subArr;
        }
    }

