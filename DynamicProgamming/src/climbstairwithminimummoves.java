import java.util.Scanner;

public class climbstairwithminimummoves {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];//No of stairs
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();//No.of jumps u can take from particular stair
        }
        Integer []dp = new Integer[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) 
        {
            if(arr[i]>0)//is jumping allowed at ith stair
            {
                int min = Integer.MAX_VALUE;
                for(int j = 1;j<=arr[i] && i + j<=n;j++){
                    if(dp[i+j]!=null)//is jumping allowed at i+jth stair
                    {
                        min = Math.min(dp[i+j],min);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }
            }    
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        scn.close();
    }
}
