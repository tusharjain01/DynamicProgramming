import java.util.Scanner;

public class targetsumsubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        boolean [][]dp = new boolean[n + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) //Players
        {
            for (int j = 0; j <= tar; j++) //Targets
            {
                if(i == 0 && j==0)//No player no target
                {
                    dp[i][j] = true;//Done
                }
                else if(i==0)//No player are available so target cant be achieved
                {
                    dp[i][j] = false;
                }
                else if(j == 0)//Target is zero so its already achieved
                {
                    dp[i][j] = true;
                }
                else{
                    if(dp[i - 1][j] == true)//if team has already completed the target 
                    {
                        dp[i][j] = true;//then player wouldnt play
                    }
                    else
                    {
                        int val = arr[i - 1];//run made by the player
                        if(j>=val)//player will only play when target is more than or equal to run made by the player
                        {
                            if(dp[i - 1][j - val] == true)//runs made by the remaining team is true
                            {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
            boolean ans = false;
            for (int j = 0; j < dp.length; j++) {
                ans = (ans||dp[i][tar]);
            }
            System.out.println(ans);
            scn.close();
        }
    }
}
