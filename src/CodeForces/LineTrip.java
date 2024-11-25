package CodeForces;
import java.util.Scanner;
public class LineTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int l = 0; l < t; l++) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int res = 0;
            int res1 = 0;
            if(arr.length==1){
                res1 = 2*(x-arr[0]);
                res = arr[0];
            }else{
                int last = arr[n-1];
                int[] temp = new int[n];
                int p = 0;
                int y=arr[0];
                for(int i=1;i<n;i++){
                    temp[i-1]=y-p;
                    p=arr[i-1];
                    y=arr[i];
                }
                temp[n-1]=y-p;
                if(y==last){
                    res1 = 2*(x-last);
                }
                for(int i=1; i<n; i++){
                    if(temp[i-1]>temp[i]){
                        res = temp[i-1];
                    }else if(temp[i-1]==temp[i]){
                        res = temp[i];
                    }else{
                        res = temp[i];
                    }
                }
            }
            System.out.println(Math.max(res1, res));
        }
        in.close();
    }
}