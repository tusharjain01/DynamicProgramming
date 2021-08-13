import java.util.Scanner;

public class goldmine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int [][]dp = new int[n][m];
        for (int col = m - 1; col >= 0; col--) {
            for (int row = n - 1; row >= 0; row--) {
                if(col == m - 1){
                    dp[row][col] = arr[row][col];
                }   
                else if(row == n - 1){
                    dp[row][col] = Math.max(dp[row - 1][col + 1],dp[row][col+ 1]) + arr[row][col];
                }
                else if(row == 0){
                    dp[row][col] = Math.max(dp[row][col + 1],dp[row + 1][col + 1]) + arr[row][col];
                }
                else{
                    dp[row][col] = Math.max(dp[row][col + 1],Math.max(dp[row + 1][col + 1],dp[row - 1][col + 1])) + arr[row][col];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < dp.length; row++) {
            max = Math.max(max,dp[row][0]);
        }
        System.out.println(max);
        scn.close();
    }
}
