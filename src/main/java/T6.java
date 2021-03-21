import java.util.Scanner;

public class T6 {
    static boolean checkBalance (int[] a) {
        int sum =0, div=0, mod=0;
        for (int i = 0; i < a.length; i++) {
            sum+= a[i];
        }
        div = sum/2;
        mod = sum%2;
        if (mod != 0){
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                div-=a[i];
                if (div == 0){
                    return true;
                }
            }
            return false;
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
        System.out.println(checkBalance(a));


    }
}
