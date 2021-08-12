import java.util.Scanner;

public class unboundedknapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []wts = new int[n];
        int []vals = new int[n];
        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }
        for (int i = 0; i < wts.length; i++) {
            vals[i] = scn.nextInt();
        }
        int capc = scn.nextInt();
        int []dp = new int[capc + 1];
        for(int bagc = 1;bagc<dp.length;bagc++){
            int max = 0;
            for(int i = 0;i<n;i++)//Stone Choose krr rhe ha baare baare se..
            {
                if(wts[i] <= bagc){
                    int rbagc = bagc - wts[i];//Remaining capacity
                    int rbagv = dp[rbagc];//Remaining capacity ko bahrne ka value
                    int tbagc = rbagv + vals[i];//Remaining value + current stones value
                    if(tbagc>max)
                    {
                        max = tbagc;//Updating the max if condition is true
                    }
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[capc]);
        scn.close();
    }
}
