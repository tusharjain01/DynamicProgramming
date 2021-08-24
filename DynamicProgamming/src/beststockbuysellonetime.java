import java.util.Scanner;

public class beststockbuysellonetime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scn.nextInt();
        }
        int lsf = Integer.MAX_VALUE;// Least so far
        int pist = 0; // Profit if sold today
        int op = 0; //Overall Profit
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        System.out.println(op);
        scn.close();
    }
}
