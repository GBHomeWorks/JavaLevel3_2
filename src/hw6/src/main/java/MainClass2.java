public class MainClass2 {
//    public static int[] digits = new int[5];        // для проверки
//
//    public static void main(String[] args) {        // для проверки
//        for (int i = 0; i < digits.length; i++) {   // для проверки
//            digits[i] = i;                          // для проверки
//        }                                           // для проверки
//        System.out.println(checkDigits(digits));    // для проверки
//    }

    // ---------------      Метод checkDigits(int[] digits) проверен        -------------
    public static boolean checkDigits(int[] digits) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 1) {
                one = true;
            } else if (digits[i] == 4) {
                four = true;
            }
        }
        return one && four;
    }
}
