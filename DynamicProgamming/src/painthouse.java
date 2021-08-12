import java.util.Scanner;

public class painthouse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int r = arr[0][0];
        int b = arr[0][1];
        int g = arr[0][2];
        for (int i = 1; i < arr.length; i++) {
            int nr = Math.min(b, g) + arr[i][0];
            int nb = Math.min(r, g) + arr[i][1];
            int ng = Math.min(b, r) + arr[i][2];
            r = nr;
            b = nb;
            g = ng;
        }
        System.out.println(Math.min(r,Math.min(b,g)));
        scn.close();
    }
}
