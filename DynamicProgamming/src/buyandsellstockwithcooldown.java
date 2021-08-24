import java.util.Scanner;

public class buyandsellstockwithcooldown {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //You cannot buy on the next day after you sell.
        //You have to cool down for a day at least before buying again.
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;
        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }
            else{
                nbsp = obsp;
            }
            if(obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }
            else{
                nssp = ossp;
            }
            if(ocsp < ossp){
                ncsp = ossp;
            }
            else{
                ncsp = ocsp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
        scn.close();
    }
}
