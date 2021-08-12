import java.util.Scanner;

public class countbinarystrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp0 = 0;
        int dp1 = 1;
        for(int i = 1;i<n;i++){
            int ndp0 = dp1;
            int ndp1 = dp0 + dp1;
            dp0 = ndp0;
            dp1 =ndp1;
        }
        System.out.println(dp0+ dp1);
        scn.close();
    }
}
