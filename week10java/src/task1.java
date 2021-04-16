import java.util.Scanner;

import static java.lang.Math.sqrt;

public class task1 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int[] list=new int[n];
        for (int i = 0; i < n; i++) {
            list[i]= in.nextInt();
        }
        int luck=0;
        for (int i = 0; i < n; i++) {
            if(Math.abs(sqrt(list[i])-(int)sqrt(list[i]))<0.0000001){
                luck++;
            }
        }
        System.out.println((int)(n/2.0+0.5)-luck);
    }
}
