public class T4 {
    public static void main(String[] args) {
        int [][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            a[i][i] = 1;
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }
    }
}
