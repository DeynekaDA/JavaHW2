public class T1 {

    static int getRandom(int from, int to) {
        return (int) (from + Math.random() * (to - from));
    }

    public static void main(String[] args) {
        int [] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = getRandom(0, 2);
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }

    }
}
