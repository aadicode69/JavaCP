package CodeForces;
import java.util.Scanner;
public class Primarytask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int z = 0; z < tc; z++){
            int t = sc.nextInt();
            int length = String.valueOf(t).length();
//            System.out.println(length);
            switch(length){
                case 1:
                    System.out.println("NO");
                    break;
                case 2:
                    System.out.println("NO");
                    break;
                case 3:
                    if(t/100!=1 || t%100<2 || t/10!=10 ){
                        System.out.println("NO");
                    }else{
                        System.out.println("YES");
                    }
                    break;
                case 4:
                    if(t/1000!=1 || t%1000<2 ||  t/100!=10 || t%100<10){
                        System.out.println("NO");
                    }else{
                        System.out.println("YES");
                    }
                    break;
                case 5:
                    System.out.println("NO");
                    break;
            }
        }
        sc.close();
    }
}
