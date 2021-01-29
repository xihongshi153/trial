import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int[] num=new int[100];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<10;i++) {
            num[i]=in.nextInt();
        }
        fun(num);
    }
    public static void fun(int[] num1)
    {
        int[] num2=new int[num1.length];
        for (int i = 0,j=0; i < num1.length-1; i++) {
            if(num1[i]!=0){
                num2[j]=num1[i];
                j++;
            }
        }
    }
}
