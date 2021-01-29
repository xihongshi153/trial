

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        char[] ch=str.toCharArray();
        ch=fun(ch);
        for(int i=0;i<ch.length;i++)
        {System.out.print(ch[i]);}

    }
    public static char[] fun(char[] a1)
    {  char[] a2=new char[a1.length];
       for(int i =a1.length-1,j=0 ;i>=0;i--,j++){
           a2[j]=a1[i];
       }
           return a2;
    }
}
