import java.util.Scanner;

public class coinchangepermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        int []dp = new int[tar + 1];
        for (int amt = 1; amt < dp.length; amt++) {
            for (int coin : coins) {
                if(coin <= amt){
                    int ramt  = amt - coin;
                    dp[amt]+=dp[ramt];
                }
            }
        }
        System.out.println(dp[tar]);
        scn.close();
    }
}
