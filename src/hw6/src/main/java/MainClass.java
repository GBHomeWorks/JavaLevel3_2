import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
//        public void subArray(int[] arr ){
        int[] arr = {0, 1, 2, 3, 0, 5, 6, 7, 8, 9};

        int b = 0;
        try {
            for (int i = arr.length - 1; arr[i] != 4; i--) {
                b = arr.length - i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В массиве нет элемента со значением '4'");;
        }
        System.out.println(b);
    }
}
