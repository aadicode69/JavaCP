package CodeForces;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int c= 0; c<t;  c++){
            String sou="";
            String s = sc.next();
            if(s.length()>10){
                sou+=s.charAt(0);
                int len=s.length()-2;
                len = Integer.parseInt(Integer.toString(len));
                sou+=len;
                sou+=s.charAt(s.length()-1);
                System.out.println(sou);
            }else{
                System.out.println(s);
            }
        }
        sc.close();
    }
}
