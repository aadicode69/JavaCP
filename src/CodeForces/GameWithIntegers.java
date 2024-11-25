package CodeForces;
import java.util.Scanner;
public class GameWithIntegers {
    public static boolean chance(int m){
        if(m%3==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int zx = 0; zx < tc; zx++){
            int n = sc.nextInt();
            if(chance(n)){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
        sc.close();
    }
}