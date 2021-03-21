import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int al = in.nextInt();
        int[] a = new int[al];
        System.out.println("Введите " + al + " чисел");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int amax = a[0], amin = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > amax) {
                amax = a[i];
            }
            if (a[i] < amin) {
                amin = a[i];
            }
        }
            System.out.println("Минимальное число " + amin);
            System.out.println("Максимальное число " + amax);

    }
}
