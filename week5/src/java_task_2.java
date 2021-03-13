import java.util.Scanner;

public class java_task_2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if(n==1) return 1;
        int a = 1;
        int b = 2;
        int c;
        for(int i=3;i<=n ;++i){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
