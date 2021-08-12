import java.util.Scanner;

public class knapsack01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []wts = new int[n];// think it as a no. of balls a player can ply
        int []vals = new int[n];//think it as a no. of runs a player can score in wts[i] balls
        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }
        for (int i = 0; i < wts.length; i++) {
            vals[i] = scn.nextInt();
        }
        int capc = scn.nextInt();//Thinks it as a balls to be played
        int [][]dp = new int[n + 1][capc + 1];
        for(int player = 1;player<dp.length;player++){
            for (int ball = 1; ball < dp[0].length; ball++){
                if(ball <= wts[player - 1]){
                    int rcap = ball - wts[player - 1];
                    if(dp[player - 1][rcap]+vals[player-1]>dp[player - 1][ball]){
                        dp[player][ball] = dp[player - 1][rcap] + vals[player];
                    }
                    else{
                        dp[player][ball] = dp[player - 1][ball];
                    }
                }
                else{
                    dp[player][ball] = dp[player - 1][ball];
                }
            }
        }
        System.out.println(dp[n][capc]);
        scn.close();
    }
}
