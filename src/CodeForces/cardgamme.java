package CodeForces;
import java.util.*;
public class cardgamme {
    public static int comp(int x, int y){
        if(x>y){
            return 1;
        }
        if(x==y) {
            return 0;
        } 
        return -1;
    }
    public static int cardgame(int a, int b, int c, int d){
        int answer = 0;
        if(comp(a,c)+comp(b,d)>0){
            answer+=1;
        }if(comp(a,d)+comp(b,c)>0){
            answer+=1;
        }if(comp(b,c)+comp(a,d)>0){
            answer+=1;
        }if(comp(b,d)+comp(a,c)>0){
            answer+=1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int res = cardgame(a1, a2, b1, b2);
            System.out.println(res);
        }
        sc.close();
    }
}
