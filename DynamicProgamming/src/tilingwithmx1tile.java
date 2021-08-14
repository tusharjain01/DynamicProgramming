import java.util.Scanner;

public class tilingwithmx1tile {
    public static void main(String[] args) {
        //Question - In how many ways can we tile n*m area using m*1 tile??
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int []dp = new int[n + 1];
        for (int i = 1; i < dp.length; i++) {
            if(i < m)
            {
                dp[i] = 1;//Becoz here i is the breadth since i<m we can only place m*1 tile vertically
            }
            else if(i == m)
            {
                dp[i] = 2;//in this case we can either place 5 tiles horizonattly or 5 tiles vertically
            }
            else{
                dp[i] = dp[i - 1] + dp[i - m];
                //dp[i - 1] --> When one tile is placed vertically i - 1 area is left
                //dp[i - m] --> When one tile is placed horizonatlly two area are left
                //one whose area is m*(m-1) where we cant place tiles vertically , we can only place 
                //tile horizontally so ultimately this is dp[i -m]
            }
        }
        System.out.println(dp[n]);
        scn.close();
    }
}
