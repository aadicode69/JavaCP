package AtCoder;

import java.util.Scanner;

public class PillingUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int res;
        if(r>=1 && r<=99){
            res = 100-r;
        }else if(r>=100 && r<=199){
            res = 200-r;
        }else if(r>=200 && r<=299){
            res = 300-r;
        }else{
            res = 400-r;
        }
        System.out.println(res);
    }
}
