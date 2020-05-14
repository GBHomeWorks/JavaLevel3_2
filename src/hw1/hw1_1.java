package hw1;

public class hw1_1 {
    public static void main(String[] args) {
// 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
        Integer a = 3;
        Integer b = 4;
        Integer bufer = 0;
        Integer massive[] = {0, 1, 2, 3, 4};
        for (int i = 0; i < massive.length; i++){
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        bufer = massive[a];
        massive[a] = massive[b];
        massive[b] = bufer;
        for (int i = 0; i < massive.length; i++){
            System.out.print(massive[i] + " ");
        }
// 2. Написать метод, который преобразует массив в ArrayList;
    }
}
