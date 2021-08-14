import java.util.Scanner;

public class tilingwith2x1tile {
    public static void main(String[] args) {
        //Question is :- We have to tell number of ways to tile up 
        //2*n area floor using 2*1 tile
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []dp = new int[n + 1];
        dp[1] = 1;// Number of ways to tile up 2*1 area floor with 2*1 tile is 1
        dp[2] = 2;//Number of ways to tile up 2*2 area floor with 2*1 tile is 2
        for(int i = 3;i<dp.length;i++){
            dp[i]=dp[i - 1] + dp[i-2];
            //dp[i-1] becoz if we keep a tile vertically than i - 1 area is left
            //dp[i-2] becoz if we keep a tile horizonatlly than 2*1 + (i-2) area is left but 
            //since to tile 2*1 area there is only way so i - 2  is no of way is left .
        }
        System.out.println(dp[n]);
        scn.close();
    }
}
