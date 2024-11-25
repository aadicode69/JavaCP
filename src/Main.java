import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int tq=0; tq<testcases; tq++){
            String s  = sc.next();
            String t = sc.next();
            int len_s = s.length();
            int len_t = t.length();
            if(len_s==len_t){
                System.out.println(len_s+len_t);
            }else{
                System.out.println(Math.max(len_s,len_t) + 1);
            }
        }
        sc.close();
    }
}