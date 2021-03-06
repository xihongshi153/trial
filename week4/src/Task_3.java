import java.util.Scanner;

import static java.lang.System.exit;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b;
        double num=in.nextDouble();
        for ( a = 1; a < 10000000; a++) {
            for ( b = 1; b < 10000000; b++) {
                if(a/b==num){
                    System.out.println((int)a+"/"+(int)b);
                    exit(0);
                }
            }

        }
    }
}
