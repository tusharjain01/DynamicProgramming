import java.util.Scanner;

public class paintfence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        long same = c * 1;
        long diff = c * (c - 1);
        long total = same + diff;
        for (int i = 3; i <= n; i++) {
            same = diff * 1;
            diff = total * (c - 1);
            total = same + diff;
        }
        System.out.println(total);
        scn.close();
    }
}
