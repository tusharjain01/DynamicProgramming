import java.util.Scanner;

public class beststockbuysellinfinite {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int bd = 0;// Buying Date
        int sd = 0;// Selling Date
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i - 1]){
                sd ++;
            }
            else{
                profit +=(arr[sd] - arr[bd]);
                bd = sd = i;
            }
        }
        profit +=(arr[sd] - arr[bd]);
        System.out.println(profit);
        scn.close();
    }
}
