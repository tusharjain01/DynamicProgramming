import java.util.Scanner;

public class buyandsellstocktwotransactionallowed {
    // First we go from left to right and store what will be the profit if we sell that day.
    // Second we go from right to left and store what will be the profit if we bought that day.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int mpist = 0;// Max Profit if sold today
        int lsf = arr[0]; // Least so far
        int []dpl = new int[arr.length]; // Stores maximum profit we could earn if we sold at ith day
        for (int i = 1; i < dpl.length; i++) {
            if(arr[i]<lsf){
                lsf = arr[i];
            }
            mpist = arr[i] - lsf;
            if(mpist > dpl[i-1]){
                dpl[i] = mpist;
            }
            else{
                dpl[i] = dpl[i-1];
            }
        }
        int mpibt = 0; // Max profit if bought today
        int maxat = arr[arr.length - 1]; // Max after today
        int []dpr = new int[arr.length]; // Stores maximum profit we could have earned if we have bought today .
        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] > maxat){
                maxat = arr[i];
            }
            mpibt = maxat - arr[i];
            if(mpibt > dpr[i+1]){
                dpr[i] = mpibt;
            }
            else{
                dpr[i] = dpr[i+1];
            }
        }
        int op = 0;// Overall profit
        for (int i = 0; i < dpr.length; i++) {
            if(dpl[i] + dpr[i] > op){
                op = dpl[i] + dpr[i];
            }
        }
        System.out.println(op);
        scn.close();
    }
}
