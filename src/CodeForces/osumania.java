package CodeForces;
import java.util.Scanner;

public class osumania {
    public static int[] checkfornote(char[][] a){
        int[] res = new int[a.length];
        for(int i = a.length - 1; i >= 0; i--){
            for(int j = 0; j < 4; j++){
                if(a[i][j] == '#'){
                    res[a.length-i-1] = j + 1;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        for(int t = 0; t < tc; t++){
            int n = sc.nextInt();
            sc.nextLine();
            char[][] arr = new char[n][4];
            for(int j = 0; j < n; j++){
                String line = sc.nextLine();
                arr[j] = line.toCharArray();
            }
            int[] result = checkfornote(arr);
            for(int k = 0; k<result.length;k++){
                System.out.print(result[k]+" ");
            }
        }
        sc.close();
    }
}
