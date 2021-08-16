import java.util.Scanner;

public class uniquepath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]dp = new int[n][m];
        for(int row = n - 1;row>=0;row--){
            for (int col = m - 1; col >= 0 ; col--) {
                if(row == n - 1 && col == m - 1){
                    dp[row][col] = 0;
                }
                else if(row == n - 1){
                    dp[row][col] = 1;
                }
                else if(col == m - 1){
                    dp[row][col] = 1;
                }
                else{
                    dp[row][col] = dp[row + 1][col] + dp[row][col + 1];
                }
            }
        }
        System.out.println(dp[0][0]);
        scn.close();
    }
}
