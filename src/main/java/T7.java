import java.util.Scanner;

public class T7 {
    static int[] arr  (int[] a , int n ){
        if (n == 0){
            return a;
        }
        int g =0;
        if (n > 0){
            for (int q = 0; q < n; q++) {
                for (int i = a.length-1; i > 0; i--) {
                    g = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = g;
                }
            }
            return a;
        } else {
            n*= -1;
            for (int q = 0; q < n; q++) {
                for (int i = 0; i < a.length - 1; i++) {
                    g = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = g;
                }
            }
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int al = in.nextInt();
        int[] a = new int[al];
        System.out.println("Введите " + al + " чисел");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("На сколько сделать смещение");
        int n = in.nextInt();
        int[] b = new int[al];
        b = arr(a,n);
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
