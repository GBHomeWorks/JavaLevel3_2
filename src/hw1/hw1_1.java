package hw1;

import javax.swing.*;
import java.util.ArrayList;


public class hw1_1 {
//    ----------------- задания 1 и 2 ------------------------------------------------
    //    Создание массива и служебных переменных
    static Integer a = 3;
    static Integer b = 4;
    static Integer bufer = 0;
    static Integer massive[] = {0, 1, 2, 3, 4};

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
    static void repositionElements() {
        bufer = massive[a];
        massive[a] = massive[b];
        massive[b] = bufer;
    }

    // 2. Написать метод, который преобразует массив в ArrayList;
    static ArrayList<Integer> arrMassive = new ArrayList<>(massive.length);

    static void toArrayList() {
        for (Integer i : massive) {
            arrMassive.add(i);
        }
    }
//    -------------  окончание заданий 1 и 2 -----------------------------------------------

    public static void main(String[] args) {
//        ----------------- задания 1 и 2 ---------------------------------------------------
//      печать исходного массива
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        System.out.println();
        repositionElements();
//      печать результата замены элементов
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        toArrayList();
//      печать коллекции
        System.out.println();
        System.out.println(arrMassive);
//        ----------- окончание заданий 1 и 2 -----------------------------------------------
//        ----------------- задание 3 ---------------------------------------------------

        Fruit<Integer, Float> apple = new Fruit<>(1, 1.0f);
    }
}
