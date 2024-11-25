package AtCoder;
import java.util.*;

public class BuyAPen {
    public static void compare(int a, int b) {
        if(a>b){
            System.out.println(b);
        }else if(a==b){
            System.out.println(a);
        }else{
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        String c=sc.next();
        switch (c.toLowerCase()){
            case "blue":compare(r,g);break;
            case "red":compare(b,g);break;
            case "green":compare(r,b);break;
        }
    }
}
