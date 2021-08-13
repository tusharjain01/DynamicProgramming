import java.util.Scanner;

public class climbstair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []dp = new int[n + 1];
        dp[0] = 1;
        //dp[i] me yehn store karunga ki i  se 0 jane ke kitne raste ha
        for (int i = 1; i < dp.length; i++) {
            if(i == 1){
                dp[i] = dp[i - 1];
            }
            else if(i == 2){
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            else{
                dp[i] = dp[i - 1]+dp[i - 2]+dp[i - 3];
            }
        }
        System.out.println(dp[n]);
        scn.close();
    }
}
