import java.util.Scanner;

public class paritionintosubsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int peoples = scn.nextInt();//Number of people
        int teams = scn.nextInt();//Number of teams
        if(peoples == 0 || teams==0 || peoples<teams){
            System.out.println(0);
            return;
        }
        int [][]dp = new int[teams+1][peoples+1];
        for (int team = 1; team < dp.length; team++) {
            for (int people = 1; people < dp[0].length; people++) {
                if(people<team){
                    dp[team][people] = 0;
                }
                else if(people == team){
                    dp[team][people] = 1;
                }
                else{
                    dp[team][people] = (dp[team][people -1]*team) + dp[team - 1][people - 1];
                }
            }
        }
        System.out.println(dp[teams][peoples]);
        scn.close();
    }
}
