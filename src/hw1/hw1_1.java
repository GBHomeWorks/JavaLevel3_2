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
//   печать исходного массива
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        System.out.println();
        repositionElements();
//   печать результата замены элементов
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        toArrayList();
//      печать коллекции
        System.out.println();
        System.out.println(arrMassive);
//        ----------- окончание заданий 1 и 2 -----------------------------------------------
//        ----------------- задание 3 ---------------------------------------------------

//  создание яблок, уклядка в ящик
        Apple apple = new Apple("apple");
        Box appleBox = new Box();   // create Box
        for(int i = 0; i < 15; i++){    // apples put in box
            appleBox.fruits.add(apple);
        }
        System.out.println(appleBox.fruits.get(0).getName() + ": appleBox.size: " + appleBox.fruits.size()); // checking

//  создание апельсин, уклядка в ящик
        Orange orange = new Orange("orange");
        Box orangeBox = new Box();   // create Box
        for(int i = 0; i < 10; i++){    // oranges put in box
            orangeBox.fruits.add(orange);
        }
        System.out.println(orangeBox.fruits.get(0).getName() + ": orangeBox.size: " + orangeBox.fruits.size()); // checking

//   Взвешивание кробки яблок
        System.out.println("название " + appleBox.fruits.get(0).getName() + ": ");
        System.out.println("вес 1 шт - " + appleBox.fruits.get(0).getWeight() + " количество " + appleBox.fruits.size());
        System.out.println("взвешивание коробки " + appleBox.getWeight(appleBox));
        System.out.println("название " + orangeBox.fruits.get(0).getName() + ": ");
        System.out.println("вес 1 шт - " + orangeBox.fruits.get(0).getWeight() + " количество " + orangeBox.fruits.size());
        System.out.println("взвешивание коробки " + orangeBox.getWeight(orangeBox));

//   сравнение ящиков по весу
        System.out.println(orangeBox.compare(appleBox));

//   перекладка фруктов в другой ящик
        Box orangeBox2 = new Box();
        for(int i = 0; i < 10; i++){    // oranges put in box
            orangeBox2.fruits.add(orange);
        }
        System.out.println(orangeBox.fruits.get(0).getName() + ": orangeBox.size: " + orangeBox.fruits.size());     // checking
        System.out.println(orangeBox2.fruits.get(0).getName() + ": orangeBox2.size: " + orangeBox2.fruits.size());  // checking
        orangeBox.shiftFruits(orangeBox2);
        System.out.println(orangeBox2.fruits.get(0).getName() + ": orangeBox2.size: " + orangeBox2.fruits.size());  // checking
    }
}
