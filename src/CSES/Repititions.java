package CSES;

import java.util.Scanner;

public class Repititions {
    public static boolean compare(char x, char y){
        if(x==y){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        dna = dna.toUpperCase();
        int counter = 1, count = 1;
        for(int i=0; i<dna.length()-1; i++){
            if(compare(dna.charAt(i),dna.charAt(i+1))){
                counter++;
                count = Math.max(count, counter);
            }else{
                count = Math.max(count, counter);
                counter = 1;
            }
        }
        System.out.println(count);

    }
}
