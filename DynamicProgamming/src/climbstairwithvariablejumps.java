import java.util.Scanner;

public class climbstairwithvariablejumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []dp = new int [n+1];
        dp[n] = 1;//n se n jane ka ek hi rasta ha chalo hi mt
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= arr[i] && i+j<=n ; j++) {
                dp[i] += dp[i+j];
            }
        }
        System.out.println(dp[0]);
        scn.close();
    }
}
